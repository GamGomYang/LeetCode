// import java.util.HashSet;
// import java.util.Set;


// public class Solution{


//     public boolean isValidSudoku(char[][] board){


//         Set<Character>[] row = new HashSet[9];
//         Set<Character>[] col = new HashSet[9];
//         Set<Character>[] box = new HashSet[9];


//         for(int i =0 ; i<9 ; i++){

//             row[i] = new HashSet<>();
//             col[i] = new HashSet<>();
//             box[i] = new HashSet<>();
//         }

//         for(int i =0 ; i<9 ; i++){

//             for(int k =0; k<9 ; k++){
//                 char target =  board[i][k];

//                 if(target == '.'){
//                     continue;
//                 }


//                 int box_index = (i/3)*3 + (k/3);

//                 if(row[i].contains(target)||col[i].contains(target)||box[box_index].contains(target)){
//                     return false;
//                 }
//                 else{

//                     row[i].add(target);
//                     col[k].add(target);
//                     box[box_index].add(target);
//                 }



                
//             }
            
//         }
//         return true;
        




//     }
// }



// import java.util.Scanner;

// public class Solution{

//     public void rotate(int[][]matrix){
//         int length = matrix.length;

//         swapMatrix(matrix, length);
//         rotateMatrix(matrix, length);
        


//     }

//     public void swapMatrix(int [][] matrix, int length ){
//         for(int i =0 ; i<length ; i++){
//             // i+1 부터 해야지 중복되엇 다시 수정되어지는것이 방지
//             for(int k =i+1 ; k<length ; k++){
//                 int temp = matrix[i][k];
//                 matrix[i][k]= matrix[k][i];
//                 matrix[k][i]= temp;
//             }
//         }

//     }

//     public void rotateMatrix(int [][] matrix , int length ){
        
        
        
        
//         for(int i =0 ; i<length ; i++){
//             int left =0 ;
//             int right = length-1;

//             while(right > left){
//                 int temp = matrix[i][right];
//                 matrix[i][right]= matrix[i][left];
//                 matrix[i][left] = temp;

//                 right--;
//                 left++;

//             }
//         }
//     }

// }



// import java.util.HashSet;
// import java.util.Set;
// public class Solution{

//     public void setZeroes(int[][] matrix) {

//         Set<Integer> row_set = new HashSet();
//         Set<Integer> col_set = new HashSet();

//         int height = matrix.length;

//         int width = matrix[0].length;


//         for(int i =0 ; i<height ; i++){

//             for(int k =0 ; k<width ; k++){
                
//                 if(matrix[i][k]==0){
//                     row_set.add(i);
//                     col_set.add(k);
//                 }
//             }
//         }
//         for(int i =0 ;i<height ; i++){
//             for(int k =0 ; k<width ; k++){
//                 if(row_set.contains(i)||col_set.contains(k)){
//                     matrix[i][k] =0;
//                 }

                
//             }
//         }


//     }
// }


import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Solution {
    public void solveSudoku(char[][] board) {

        sudoku_backtracking(board);

    }

    public boolean sudoku_backtracking(char[][] board){



        for(int i =0 ; i<9 ; i++){

            for(int k =0 ;k<9 ; k++){

                if(board[i][k]== '.'){
                    for(int digit =1; digit<10 ; digit++){
                        if(sudoku_checker(board, i, k ,digit)){
                            // 일반적인 형변환에서 0을 43에서부터 시작한다.
                            board[i][k] = (char)(digit+'0');
    
                            if(sudoku_backtracking(board)){
    
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


    public boolean sudoku_checker(char[][] matrix,int row, int col, int digit){
        for(int i =0 ; i<9 ; i++){
            if(matrix[i][col] == (char)(digit+'0')){
                return false;
            }
        }
        for(int k =0 ; k< 9 ; k++){

            if(matrix[row][k] == (char)(digit+'0')){
                return false;
            }
        }

        int box_row = (row/3)*3;
        int box_col = (col/3)*3;
        int box_index = (row/3)*3 + (col/3);

        for(int i =0 ; i<3 ; i++){

            for(int k =0 ;k<3 ; k++){

                if(matrix[box_row +i][box_col+k]== (char)(digit+'0')){
                    return false;
                }
            }
        }

        return true;

        



    }



}