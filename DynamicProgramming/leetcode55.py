'''
#solution1 : time exceed limit 

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        
        dp = [False] * n
        dp[0] = True  
        
        for i in range(1, n):
            for j in range(i):
                if dp[j] and j + nums[j] >= i:
                    dp[i] = True
                    break   
        
        return dp[n - 1]

'''

#solution 2 : lagest distance

class Solution:
    def canJump(self, nums):
        max_reach = 0
        
        for i in range(len(nums)):
            if i > max_reach:
                return False
            
            max_reach = max(max_reach, i + nums[i])
        
        return True