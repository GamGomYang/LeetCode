from collections import deque
from typing import List

class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        m , n = len(mat) , len(mat[0])

        dist = [[-1]*n for _ in range(m)]

        q = deque()

        for i in range(m):
            for k in range(n):
                if mat[i][k] == 0:
                    dist[i][k] = 0
                    q.append((i,k))

        directions = [(1,0) , (-1,0) , (0,1) , (0,-1)]


        while q:
            x,y = q.popleft()
            for dx, dy in directions:
                nx , ny = x + dx, y + dy

                if 0 <=nx < m and 0<=ny <n:
                    if dist[nx][ny] == -1:
                        dist[nx][ny] = dist[x][y] +1
                        q.append((nx,ny))

        return dist