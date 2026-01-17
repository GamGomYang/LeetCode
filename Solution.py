from collections import deque
from typing import List

class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights or not heights[0]:
            return []

        m, n = len(heights), len(heights[0])

        pacific = [[False] * n for _ in range(m)]
        atlantic = [[False] * n for _ in range(m)]

        # BFS 공통 함수
        def bfs(starts, visited):
            queue = deque(starts)
            for r, c in starts:
                visited[r][c] = True

            while queue:
                r, c = queue.popleft()
                for dr, dc in [(1,0), (-1,0), (0,1), (0,-1)]:
                    nr, nc = r + dr, c + dc

                    # 범위 체크
                    if nr < 0 or nr >= m or nc < 0 or nc >= n:
                        continue
                    # 이미 방문한 경우
                    if visited[nr][nc]:
                        continue
                    # 역방향 물 흐름 조건 (중요!)
                    if heights[nr][nc] < heights[r][c]:
                        continue

                    visited[nr][nc] = True
                    queue.append((nr, nc))

        # Pacific 시작점 (위쪽 row + 왼쪽 column)
        pacific_starts = []
        for c in range(n):
            pacific_starts.append((0, c))
        for r in range(m):
            pacific_starts.append((r, 0))

        # Atlantic 시작점 (아래쪽 row + 오른쪽 column)
        atlantic_starts = []
        for c in range(n):
            atlantic_starts.append((m - 1, c))
        for r in range(m):
            atlantic_starts.append((r, n - 1))

        # BFS 실행
        bfs(pacific_starts, pacific)
        bfs(atlantic_starts, atlantic)

        # 결과 수집 (교집합)
        res = []
        for r in range(m):
            for c in range(n):
                if pacific[r][c] and atlantic[r][c]:
                    res.append([r, c])

        return res
