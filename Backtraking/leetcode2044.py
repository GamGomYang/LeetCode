class Solution:
    def countMaxOrSubsets(self, nums: List[int]) -> int:

        max_nums = 0

        for n in nums :
            max_nums |= n


        result = 0


        def dfs(index , calc_or):
            nonlocal result 

            if index == len(nums):
                if calc_or == max_nums:
                    result +=1
                return

            
            dfs(index+1 , calc_or)
            dfs(index+1 , calc_or | nums[index])

        dfs(0,0)

        return result
                