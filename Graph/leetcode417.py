from collections import deque
from typing import List

class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights or not heights[0]:
            return []
        
        directions = [(0,1),(0,-1),(1,0),(-1,0)]
        
        m = len(heights)
        n = len(heights[0])

        pacific = [[False] * n for _ in range(m)]
        atlantic = [[False] * n for _ in range(m)]

        result = []

        def bfs(starts, visited):
            queue = deque(starts)

            for r, c in starts:
                visited[r][c] = True

            while queue:
                r, c = queue.popleft()

                for nx , ny in directions:
                    dx , dy = r+nx , c +ny

                    if dx < 0 or dx >= m or dy < 0 or dy>= n:
                        continue
                    if visited[dx][dy] :
                        continue
                    if heights[dx][dy] < heights[r][c]:
                        continue

                    visited[dx][dy] = True
                    queue.append((dx,dy))

        pacific_starts = []
        for c in range(n):
            pacific_starts.append((0,c))
        for r in range(m):
            pacific_starts.append((r,0))

        atlantic_starts = []
        for c in range(n):
            atlantic_starts.append((m-1, c))

        for r in range(m):
            atlantic_starts.append((r,n-1))

        
        bfs(pacific_starts , pacific)

        bfs(atlantic_starts , atlantic)

        for r in range(m):
            for c in range(n):
                if pacific[r][c] and atlantic[r][c]:
                    result.append((r,c))

        
        return result
                


