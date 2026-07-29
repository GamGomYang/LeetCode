from collections import Counter


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        dict = Counter(nums)

        sorted_dict = sorted(dict , key = lambda i : dict[i], reverse = True)

        return sorted_dict[:k]

        


