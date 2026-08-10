from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        result = 0

        while left < right:
            h = min(height[left], height[right])
            result = max(result, (right - left) * h)


            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return result

                
