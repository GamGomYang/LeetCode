class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:

        count = 0
        memo = {}

        def dfs(num_sum): 
    
            if num_sum == target:
                return 1
            
            if num_sum > target:
                return 0 

            if num_sum in memo:
                return memo[num_sum]

            count = 0
            
            for num in nums:
                count += dfs(num_sum + num)

            memo[num_sum] = count

            return count


        return dfs(0)
