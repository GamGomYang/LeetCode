import heapq

class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        heap = []

        for num in arr:
            distance = abs(num-x)
            heapq.heappush(heap , (distance , num))
        result = []
        for _ in range(k):
            distance , num = heapq.heappop(heap)
            result.append(num)
        
        result.sort()
        return result 
            