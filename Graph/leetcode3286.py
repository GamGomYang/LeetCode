from typing import List
from collections import deque

class Solution:
    def findSafeWalk(self, grid: List[List[int]], health: int) -> bool:
        m, n = len(grid), len(grid[0])

        INF = float("inf")

        dist = [[INF]*n for _ in range(m)]

        dist[0][0] = grid[0][0]

        q = deque()
        q.append((0,0))

        directions = [(0,1),(0,-1),(1,0),(-1,0)]

        while q:
            x,y = q.popleft()

            for dx, dy in directions:
                nx = x+dx
                ny = y +dy

                if 0<= nx <m and 0<= ny <n:
                    cost = grid[nx][ny]
                    new_cost = dist[x][y]+ cost

                    if new_cost < dist[nx][ny]:
                        dist[nx][ny] = new_cost

                        if cost == 0:
                            q.appendleft((nx,ny))

                        else:
                            q.append((nx,ny))

        return dist[m-1][n-1]<health