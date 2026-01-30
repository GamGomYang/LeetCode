from collections import defaultdict
import heapq

class Solution:
    def minimumCost(self, source: str, target: str,
                    original: list[str], changed: list[str],
                    cost: list[int]) -> int:

        graph = defaultdict(list)
        for o, c, w in zip(original, changed, cost):
            graph[o].append((c, w))

        INF = 10**18
        dist = [[INF]*26 for _ in range(26)]

        for i in range(26):
            start = chr(i + ord('a'))
            pq = [(0, start)]
            dist[i][i] = 0

            while pq:
                cur_cost, u = heapq.heappop(pq)
                ui = ord(u) - ord('a')

                if cur_cost > dist[i][ui]:
                    continue

                for v, w in graph[u]:
                    vi = ord(v) - ord('a')
                    new_cost = cur_cost + w
                    if new_cost < dist[i][vi]:
                        dist[i][vi] = new_cost
                        heapq.heappush(pq, (new_cost, v))

        ans = 0
        for s, t in zip(source, target):
            if s != t:
                si = ord(s) - ord('a')
                ti = ord(t) - ord('a')
                if dist[si][ti] == INF:
                    return -1
                ans += dist[si][ti]

        return ans
