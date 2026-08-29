      
class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
                         
        def possible(w):

            total = 1
            weight_sum =0

            for weight in weights:

                if weight_sum + weight > w :
                    total += 1
                    weight_sum = 0

                weight_sum += weight

            return total <= days

        left = max(weights)
        right = sum(weights)
        result_day = 0

        while left <= right :
            mid = (left + right )//2 

            if possible(mid):
                result_day = mid
                right = mid-1
            else:
                left = mid+1

        return result_day
                

            
            

            

