import java.util.Scanner;

public class Solution{
    public void swap_matrix(int[][] matrix){
        int length = matrix.length;
        for(int i =0 ; i< length ; i++){
            for(int k =i ; k<length ; k++){

                int temp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
    public void reverse_matrix(int[][] matrix){
        int length = matrix.length;
        for(int k =0 ; k<length ; k++){
            int right = length -1;
            int left = 0;

            while(left<right){
                int temp = matrix[k][right];
                matrix[k][right] = matrix[k][left];
                matrix[k][left] = temp;
                right--; 
                left++; 
            }
        }
    }
    public void rotate(int[][] matrix) {
        swap_matrix(matrix);
        reverse_matrix(matrix);
        int length =  matrix.length;
        for(int i=0 ; i< length ; i++){

            System.out.print("[");
            for(int k =0 ; k<length ; k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("length : ");
        length = scanner.nextInt();
        int[][] matrix = new int[length][length];
        for(int  i =0 ; i<length ; i++){
            for(int k =0 ; k< length ; k++){
                System.out.print("["+i+"]"+"["+k+"]"+ " matrix ? :");
                matrix[i][k]= scanner.nextInt();
            }
        }
        Solution solution = new Solution();

        solution.rotate(matrix);
    }
}
