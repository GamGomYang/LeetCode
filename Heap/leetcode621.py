import heapq
from collections import Counter, deque

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        time = 0
        count = Counter(tasks)
        #Counter - 딕셔너리 타임 {'a:3'} 형태로 저장되어짐

        max_heap = [-c for c in count.values()]

        heapq.heapify(max_heap)

        cooldown = deque()
        while max_heap or cooldown:
            time +=1 

            if max_heap :
                current = heapq.heappop(max_heap)+1
                if current != 0 :
                    cooldown.append((current , time+n))
            
            if cooldown and cooldown[0][1] == time:
                heapq.heappush(max_heap , cooldown.popleft()[0])
        return time


