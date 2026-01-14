from collections import deque
from typing import List

class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        m, n = len(mat) , len(mat[0])

        dist = [[-1]*m for _  in range(n)]

        q = deque()

        for i in range(m):
            for j in range(n):
                if mat[i][j] == 0 :
                    dist[i][j] = 0
                    q.append((i,j))

        directions = [(0,1) , (1,0) , (0,-1), (-1,0)]

        while q :
            x,y = q.popleft()
            for dx, dy in directions:
                nx, ny = x + dx , y + dy

                if 0 <= dx < m and 0 <= ny < n:

                    if dist[dx][dy] == -1:
                        dist[dx][dy] = dist[x][y]+1
                        q.append((nx,ny))

        return dist