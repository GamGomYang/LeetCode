class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        directions = [(1,0),(0,1),(-1,0),(0,-1)]

        count = 0

        def dfs(i,j):
            if i<0 or i>=len(grid) or \
            j<0 or j>=len(grid[0]) or \
            grid[i][j] != "1" :
                return
            
            grid[i][j] = "0"
            
            for dx , dy in directions:
                nx = i +dx
                ny = j +dy
                dfs(nx,ny)
            
        for i in range (len(grid)):
            for j in range (len(grid[0])):
                if grid[i][j] == "1":
                    count+=1
                    dfs(i,j)

        return count