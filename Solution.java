import java.util.*;


class Solution {
    public void swap_matrix(int[][] matrix){

        int length =  matrix.length;
        
        for(int i=0 ; i<length ; i++){

            for(int k =i ; k< length ; k++){
              int temp = matrix[i][k];
              matrix[i][k] = matrix[k][i];
              matrix[k][i] = temp;
                
            }
        }
    }

    public void replace_matrix(int[][] matrix){

        int length = matrix.length;


        for(int i =0 ; i< length ; i++){
            int right =length - 1;
            int left =0;
        while(right> left){

            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            right--;
            left++;
        }
    }
    }


    public void rotate(int[][] matrix) {
        swap_matrix(matrix);
        replace_matrix(matrix);
        
    }
}