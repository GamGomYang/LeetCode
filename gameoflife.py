from typing import List
class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        directions = [(-1,-1),(-1,1),(-1,0),(1,0),(0,1),(0,-1),(1,-1),(1,1)]


        width = len(board[0])
        height = len(board)

        for row in height :

            for col in width :
                num_count = 0
                number = board[row][col]

                for dr, dc in directions :
                    nr = row + dr
                    nc = col + dc

                    if 0<=dr<=height and 0<=dc<=width:
                        num_count += abs(board[nr][nc]) % 2

                if number ==1 and (num_count<2 or num_count>3):
                    board[row][col] = -1
                elif number == 0 and num_count == 3:
                    board[row][col] = 2


        for i in range(height):
            for j in range(width):

                if board[i][j] == -1:
                    board[i][j] = 0
                elif board[i][j] == 2:
                    board[i][j] =1

        return board
                
                    

                    



                    




        