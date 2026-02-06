
class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:

        length = len(nums)
        result = [0]*length

        for i in range(length):
                n = nums[i]
                position = (i+n)%length
                result[i] = nums[position]

        return result

