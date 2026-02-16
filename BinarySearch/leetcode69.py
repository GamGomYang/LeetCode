class Solution:
    def mySqrt(self, x: int) -> int:

        result = 0
        right = x//2
        left = 0

        if x == 1:
            return 1

        while left <= right:
            mid = (left + right)//2

            if mid * mid == x:
                return mid
            elif mid*mid > x:
                right = mid-1
            elif mid*mid < x:
                result = mid
                left = mid+1

        return result


        