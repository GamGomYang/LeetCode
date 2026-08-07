from typing import List

class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """

        directions = [(-1,-1),(-1,0),(0,-1),(1,1),(1,0),(0,1),(-1,1),(1,-1)]

        width = len(board[0])
        height= len(board)

        result = [[0 for _ in range(width)] for _ in range(height)]
        # number 가 1일때 - 3개 이상 - 과다 죽음 , 2,3개 - 생존 , 2개미만 - 죽음

        for row in range(height):

            for col in range(width):
                total = 0
                for nr,nc in directions:
                    dr = row + nr
                    dc = col + nc

                    if 0<=dr<height and 0<=dc<width and abs(board[dr][dc]) == 1:
                        total += 1


                if board[row][col] == 1 and (total < 2 or total >3):
                    board[row][col] = -1
                elif board[row][col] == 0 and (total == 3 ):
                    board[row][col]=2


        for i in range(height):
            for j in range(width):

                if board[i][j] < 0 :
                    board[i][j] = 0 
                elif board[i][j] > 1 :
                    board[i][j] = 1

            
        

        
                
                        