from collections import deque

class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:

        height = len(grid)
        width = len(grid[0])
        visit = [[False] * width for _ in range(height)]

        if grid[0][0] == 1:
            return -1

        directions = [(-1,-1),(-1,0),(0,-1),(1,1),(1,0),(0,1),(-1,1),(1,-1)]    

        queue = deque()
        distance = 1
        queue.append((0,0,distance))
        visit[0][0] = True

        while queue:
            row, col, distance  = queue.popleft()

            if row == height-1 and \
                col == width -1 :
                    return distance 

            for dr , dc in directions :
                nr = row + dr
                nc = col + dc
                
                if 0<= nr < height and 0<= nc < width \
                    and not visit[nr][nc]\
                    and grid[nr][nc] == 0:
                    
                    queue.append((nr,nc,distance+1))
                    visit[nr][nc] = True

        return -1
                    




        