class Solution:
    def myAtoi(self, s: str) -> int:

        INT_MAX , INT_MIN = (2**31-1) , -2**31

        sign = 1
        result = 0

        s= s.lstrip()
        if not s:
            return 0

        if s[0] in "+-":
            if s[0] == '-':
                sign = -1

            index = 1

        while index < len(s) and s[index].isdecimal():
            result = result*10+int(s[index])
            index +=1 

        result *= sign

        if result < INT_MIN:
            return INT_MIN
        elif result > INT_MAX:
            return INT_MAX
        else:
            return result

        
if __name__ == "__main__":
    solution = Solution()

    input = "-91283472332"

    output = solution.myAtoi(input)

    print(output)
