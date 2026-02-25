class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        visit = [False] * len(nums)

        def recursion(path):
            if len(path) == len(nums):
                result.append(path[:])
                return
            
            for i in range(len(nums)):
                if not visit[i]:
                    visit[i] = True
                    recursion(path + [nums[i]])
                    visit[i] = False

        
        recursion([])
        return result