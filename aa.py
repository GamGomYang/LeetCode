class Solution:
    def decodeString(self, s: str) -> str:
        stack = []              # (이전 문자열, 반복 횟수)
        current_str = ""        # 지금 만들고 있는 문자열
        current_num = 0         # 바로 앞에서 읽은 숫자 (k)

        for ch in s:
            # 숫자 처리 (여러 자리 수 가능)
            if ch.isdigit():
                current_num = current_num * 10 + int(ch)

            # '[' : 현재 상태를 스택에 저장
            elif ch == '[':
                # 불변식:
                # '['를 만나는 순간,
                # current_str 은 "이전 레벨 문자열"
                # current_num 은 그 문자열에 적용될 반복 횟수
                stack.append((current_str, current_num))
                current_str = ""    # 새 레벨 문자열 시작
                current_num = 0

            # ']' : 스택에서 이전 상태 복원
            elif ch == ']':
                prev_str, num = stack.pop()
                # 불변식:
                # current_str 은 괄호 안 문자열
                # prev_str + current_str * num 이 새로운 문자열
                current_str = prev_str + current_str * num

            # 일반 문자
            else:
                current_str += ch

        return current_str
