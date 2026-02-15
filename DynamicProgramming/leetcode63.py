class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:

        r = len(obstacleGrid)
        c = len(obstacleGrid[0])

        dp = [0] * c

        dp[0] = 1 if obstacleGrid[0][0] == 0  else 0

        
        for j in range(1,c):
            if obstacleGrid[0][j] == 1:
                dp[j] = 0
            else:
                dp[j] = dp[j-1]

        
        for i in range( 1,r):
            if obstacleGrid[i][0] == 1:
                dp[0] = 0
            
            for j in range(1,c):
                if obstacleGrid[i][j] == 1:
                    dp[j] = 0
                
                else: dp[j] += dp[j-1]
        
        return dp[-1]