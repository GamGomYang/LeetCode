import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Solution {
    public void solveSudoku(char[][] board) {

        solve(board);
    }

//boolean타입으로 스토쿠 푸는 함수 
public boolean solve(char[][] board){
    for(int i =0 ; i< 9 ; i++){
        for(int k =0 ; k< 9 ;k++){
            if(board[i][k] == '.'){
                for(int digit =1 ; digit <10 ; digit++){
                    if(sudoku_checker(board, i, k ,digit)){
                        // 일반적인 형변환에서 0을 43에서부터 시작한다.
                        board[i][k] = (char)(digit+'0');

                        if(solve(board)){

                            return true;
    
                        }
                        
                    board[i][k] = '.';
                    }
                    
                }
                return false;
            }
            
        }
        
    }
return true;

}

// sudoku_checker(boolean) : 같은 행, 열, 박스에 digit가 존재하는지 확인
    public boolean sudoku_checker(char board[][], int row, int col , int digit){
      
      // 같은 행(row)에 digit 가 존재하는지 확인
        for(int i =0; i<9 ; i++){
        if(board[row][i] == (char)(digit+'0')){
            return false;
        }
      }
      // 같은 열(column)에 digit가 존재하는지 확인
      for(int k =0 ; k<9 ; k++){

        if(board[k][col] == (char)(digit+'0')){
            return false;
        }
      }


      int box_row = (row/3)*3;
      int box_col = (col/3)*3;
      // 같은 박스에  digit가 존재하는지 확인
      for(int i =0 ; i<3; i++){
        for(int k =0 ; k<3 ; k++){

            if(board[box_row+i][box_col+k] == (char)(digit+'0')){
                return false;
            }
        }
      }

    return true;


    }
}