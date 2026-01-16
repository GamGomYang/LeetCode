class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        directions = [(1,0) , (0,1), (-1,0) , (0,-1)]
        def dfs(r, c , idx):

            if idx == len(word):
                return True
            
            if r<0 or c<0 or r>=len(board) or c >=len(board[0]):
                return False
            if board[r][c] != word[idx]:
                return False
            
            temp = board[r][c]
            board[r][c] = '#'
            
            for dx, dy in directions:
                if dfs(r+dx , c+dy, idx +1):
                    return True
            
            board[r][c]= temp
            return False


        row = len(board)
        col = len(board[0])

        for i in range(row):
            for j in range(col):

                if board[i][j] == word[0]:
                    if dfs(i,j, 0):
                        return True
                    
        return False