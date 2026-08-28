from collections import deque 
class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        width = len(grid[0])
        height = len(grid)

        queue = deque()
        area = 0
        max_area = 0

        directions = [(-1,0),(0,-1),(1,0),(0,1)]

        for i in range(height):
            for j in range(width):

                if grid[i][j] == 1 :
                    queue.append((i,j))
                    area =1
                    grid[i][j] = 0

                    while queue :
                        row, col = queue.popleft()

                        for dr , dc in directions:
                            nr = row + dr
                            nc = col + dc

                            if 0<= nr < height and \
                                0<= nc < width and \
                                grid[nr][nc] == 1:
                                    area +=1
                                    grid[nr][nc] = 0
                                    queue.append((nr,nc))

                        max_area = max(max_area , area)

        return max_area



