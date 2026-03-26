import heapq
from collections import Counter , deque

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:


        # Count - 자동 카운팅 딕셔너리
        # a,a,b,b,b -> a:2 , b:3 이렇게 자동 딕셔너리로 나옴
        count = Counter(tasks)
        max_heap = [-c for c in count.values()]
        # 리스트를 한번에 heap으로 만들기
        # for문을 이용한 heappush보다 더 빠르다.
        heapq.heapify(max_heap)
        
        waiting = deque()
        time = 0

        while max_heap or waiting:
            time += 1
            
            if max_heap :
                current = heapq.heappop(max_heap)+1
                if current != 0:
                    waiting.append((current, time + n))
                
            if waiting and waiting[0][1] == time:
                heapq.heappush(max_heap, waiting.popleft()[0])

        return time