# class Solution:
#     def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        
#         result = []

#         for interval in intervals:
#             if interval[0]>newInterval[1]:
#                 result.append(newInterval)
#                 newInterval = interval
            
#             elif interval[1]<newInterval[0]:
#                 result.append(interval)

#             else:
#                 newInterval[0] = min(interval[0], newInterval[0])
#                 newInterval[1] = max(interval[1], newInterval[1])

#         result.append(newInterval)

#         return result

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        answer =[]

        for i in range(len(nums-2)):
            if i > nums[i]  == nums[i-1]:
                continue

            left = i+1
            right = len(nums)-1

            while (left<right):
                sum = nums[i] + nums[left] + nums[right]

                if sum == 0:
                    result = [nums[i], nums[left], nums[right]]

                    answer.append(result)

                while(left < right and nums[left] == )