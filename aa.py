from collections import defaultdict
import heapq

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        graph = defaultdict(list)

        for u, v, w in times:
            graph[u].append((v,w))

        queue = []

        dist = defaultdict(int)

        heapq.heappush(queue,(0,k))

        while queue:
            time, node = heapq.heappop(queue)
            if node not in dist:
                dist[node] = time
                for v, w in graph[node]:
                    alt = time + w
                    heapq.heappush(queue,(alt, v))

        if len(dist) == n :
            return max(dist.values())
        
        return -1