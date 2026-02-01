from collections import deque

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:

        rows, cols = len(grid), len(grid[0])

        queue = deque()

        fresh = 0

        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == 2:
                    queue.append((i,j))
                elif grid[i][j] == 1:
                    fresh += 1

        
        minutes = 0

        directions = [(1,0),(0,1),(-1,0),(0,-1)]

        while queue:
            
            size = len(queue)
            detected = False
            for _ in range(size):
                r , c = queue.popleft()

                for dx, dy in directions:
                    nx = dx + r
                    ny = dy + c

                    if 0<= nx < rows and 0<=ny < cols and grid[nx][ny] == 1:
                        grid[nx][ny] = 2
                        fresh -= 1
                        queue.append((nx,ny))

                        detected = True
            if detected :
                minutes +=1                


        return minutes if fresh == 0 else -1
                