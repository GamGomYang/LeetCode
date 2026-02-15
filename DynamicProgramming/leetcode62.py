class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        dp = [1]*n

        for i in range(1,m):
            dp[0] = dp[0]
            for j in range(1,n):
                dp[j] = dp[j-1] + dp[j]

        return dp[-1] 
