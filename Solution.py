class Solution:
    def myAtoi(self, s: str) -> int:

        length  = len(s)

        INT_MAX , INT_MIN = (2**31-1) , -2**31

        sign = 1
        result = 0

        s= s.lstrip()

        if s[0] in "+-":
            if s[0] == '-':
                sign = -1


        index =1

        while index < length and s[index].isdecimal():
            result = result * 10 + int(s[index])

            index +=1 

        result *= sign

        if result < INT_MIN:
            return INT_MIN
        elif result > INT_MAX:
            return INT_MAX
        else:
            return result

        

