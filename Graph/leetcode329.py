class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        if not matrix or not matrix[0]:
            return 0
        
        row= len(matrix)
        col = len(matrix[0])

        directions = [(1,0), (-1,0), (0,1), (0,-1)]

        dp = [[0]* col for _ in range(row)]

        def dfs(r : int , c : int )-> int:
            if dp[r][c] != 0 :
                return dp[r][c]
            
            max_length =1
            for dr, dc in directions:
                nr = r +dr
                nc = c +dc

                if nr < 0 or nr >= row or nc <0 or nc >= col:
                    continue

                if matrix[nr][nc] > matrix[r][c]:
                    length_from_next = dfs(nr,nc)
                    max_length = max(max_length , 1+length_from_next)
            dp[r][c]= max_length

            return max_length
        
        answer = 0

        for r in range(row):
            for c in range(col):
                answer = max(answer , dfs(r,c))

        return answer
