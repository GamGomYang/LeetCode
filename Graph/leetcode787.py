from collections import defaultdict

# k = 경유할 수 있는 노드 개수
# src = 시작지점
# dst = 도착지점

class Solution:
    def findCheapestPrice(
        self, n: int, flights: List[List[int]], src: int, dst: int, k: int
    ) -> int:

        INF = float("inf")
        dist = [INF] * n
        dist[src] = 0

        # 최대 k+1번 간선 사용
        for _ in range(k + 1):
            tmp = dist[:]   # 이전 상태 복사

            for u, v, w in flights:
                if dist[u] == INF:
                    continue
                tmp[v] = min(tmp[v], dist[u] + w)

            dist = tmp

        return dist[dst] if dist[dst] != INF else -1


        