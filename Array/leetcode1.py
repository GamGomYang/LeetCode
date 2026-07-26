class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        hash = {}

        for i, num in enumerate(nums):

            needed = target - num

            if needed in hash:
                return [hash[needed] , i]

            hash[num] = i 

        return []