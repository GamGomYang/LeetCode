class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        def possible(k):

            total = 0

            for pile in piles:

                if pile % k != 0 :
                    total += (pile // k) +1
                else:
                    total += pile//k

            return total <= h

        left = 1
        right = max(piles)
        result = right
        while left <= right :
            mid = (left+right)//2 

            if possible(mid):
                result = mid 
                right = mid-1 

            else:
                left = mid+1

        return result 
            
                        

            
            

            

