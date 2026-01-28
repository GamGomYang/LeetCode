from collections import defaultdict
import heapq
class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        graph = defaultdict(list)
        
        # u - 현재위치, v - 목적지, w - 가중치
        for u , v , w in times:
            graph[u].append((v,w))

        # 큐 - [소요시간 , 시작지점]
        queue = []
        dist = defaultdict(int)
        heapq.heappush(queue)

        while queue:
            time , node = heapq.heappop(queue)
            if node not in dist:
                dist[node] = time
                for v, w in graph[node]:
                    alt = time +w
                    heapq.heappush(queue, (alt, v))
        
        if len(dist) == n:
            return max(dist.values())
        return -1

