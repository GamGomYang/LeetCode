def solution(expressions):

    # 2~10진법 set에 저장
    possible_bases = set(range(2, 10))
    
    max_digit = 0
    #최대 진법 계산 - max(num)이 결국 n진법의 최대가 될 수 있음
    for exp in expressions:
        parts = exp.split()

        for token in parts:
            if token.isdigit():

                for ch in token:
                    max_digit = max(max_digit, int(ch))

    min_base = max_digit + 1
    
    #set 자료형이라서 {}를 썼음. set comprehension
    possible_bases = {b for b in possible_bases if b >= min_base}
    
    for exp in expressions:
        A, op, B, _, C = exp.split()
        if C == "X":
            continue
        
        new_bases = set()
        for base in possible_bases:
            try:
                # 진법 계산하는 식
                # int(a,base) -> base진법으로 수치 바꾸고
                # 즉 a는 base진법에 따라서 변환
                a = int(A, base)
                b = int(B, base)
                c = int(C, base)
            except:
                continue
            
            if op == "+" and a + b == c:
                new_bases.add(base)
            elif op == "-" and a - b == c:
                new_bases.add(base)
        
        possible_bases = new_bases
    
    answer = []
    
    for exp in expressions:
        A, op, B, _, C = exp.split()
        if C != "X":
            continue
        
        results = set()
        
        for base in possible_bases:
            a = int(A, base)
            b = int(B, base)
            
            if op == "+":
                value = a + b
            else:
                value = a - b
            
            # 진법 변환
            if value == 0:
                results.add("0")
                continue
            
            converted = ""

            temp = value
            while temp > 0:
                converted = str(temp % base) + converted
                temp //= base
            
            results.add(converted)
        
        if len(results) == 1:
            result_value = results.pop()
        else:
            result_value = "?"
        
    return answer