class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:

        num_sum = sum(nums[:k])

        max_sum = num_sum


        for i in range(k, len(nums)):
            num_sum += nums[i]
            num_sum -= nums[i-k]

            max_sum  = max(max_sum , num_sum)

        return float(max_sum / k)
