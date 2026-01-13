class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        balance = 0
        first = {0:-1}

        res = 0

        for i, x in enumerate(nums):
            
            balance +=1 if x == 1 else -1

            if balance in first:
                res = max(res , i - first[balance])
            else:
                first[balance] = i 

            
        return res

