# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         nums_map = {}

#         for idx , num in enumerate(nums):
#             need = target - num

#             if need in nums_map:
#                 return [nums_map[need] , idx]
            
#             nums_map[num] = idx
                


# class Solution:
#     def maxProfit(self, prices: List[int]) -> int:
        
#         min_price = prices[0]
#         max_profit = 0

#         for i in prices:
#             min_price = min(min_price , i)
#             max_profit = max(max_profit , i - min_price)

#         return max_profit 


class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        