'''
Unique Paths

Unique Paths II

Triangle

Minimum Falling Path Sum
'''

class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:

        r = len(grid)

        c = len(grid[0])

        dp = [0]*c

        dp[0] = grid[0][0]


        for j in range(1,c):
            dp[j] = grid[0][j] + dp[j-1] 


        for i in range(1,r):
            dp[0] = dp[0] + grid[i][0]
            for j in range(1,c):
                dp[j] = grid[i][j] + min(dp[j-1],dp[j])

        
        return dp[-1]


