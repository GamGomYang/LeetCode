from typing import List
from collections import defaultdict

class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:

        dict = defaultdict(int )
        current_sum = 0
        dict[0] = 1
        count = 0

        for num in nums:
            current_sum += num
            target = current_sum - goal 
            count += dict[target]
            dict[current_sum] += 1


        return count