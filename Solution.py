from collections import defaultdict
import heapq

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        
        graph = defaultdict()

        for u,v,w in times:
            graph[u].append((v,w))

        queue = []

        heapq.heappush(queue,(0,k))
        dest = defaultdict(int)


        while queue:
            time, node = heapq.heappop(queue)

            if node not in dest:
                dest[node]= time

                for v,w in graph[node]:
                    alt = time +w
                    heapq.heappush(queue,(alt,v))

        if len(dest) == n:
            return max(dest.values())
        else :
            return -1


        