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


// import java.util.Scanner;
// import java.util.List;
// import java.util.Arrays;

// class Solution {
//     public void solveSudoku(char[][] board) {

//         sudoku_backtracking(board);

//     }

//     public boolean sudoku_backtracking(char[][] board){



//         for(int i =0 ; i<9 ; i++){

//             for(int k =0 ;k<9 ; k++){

//                 if(board[i][k]== '.'){
//                     for(int digit =1; digit<10 ; digit++){
//                         if(sudoku_checker(board, i, k ,digit)){
//                             // 일반적인 형변환에서 0을 43에서부터 시작한다.
//                             board[i][k] = (char)(digit+'0');
    
//                             if(sudoku_backtracking(board)){
    
//                                 return true;
        
//                             }

//                         board[i][k] = '.';
//                     }
//                     }

//                   return false;
//                 }



//             }
//         }

//         return true;
//     }


//     public boolean sudoku_checker(char[][] matrix,int row, int col, int digit){
//         for(int i =0 ; i<9 ; i++){
//             if(matrix[i][col] == (char)(digit+'0')){
//                 return false;
//             }
//         }
//         for(int k =0 ; k< 9 ; k++){

//             if(matrix[row][k] == (char)(digit+'0')){
//                 return false;
//             }
//         }

//         int box_row = (row/3)*3;
//         int box_col = (col/3)*3;
//         int box_index = (row/3)*3 + (col/3);

//         for(int i =0 ; i<3 ; i++){

//             for(int k =0 ;k<3 ; k++){

//                 if(matrix[box_row +i][box_col+k]== (char)(digit+'0')){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }


// import java.util.HashMap;
// import java.util.List;

// class TimeMap {


//     HashMap<String,List<Pair>> hashmap = new HashMap<>();


//     public TimeMap() {
        
//     }
    
//     public void set(String key, String value, int timestamp) {
//         if(hashmap.isEmpty()){
//             hashmap.put(key, <timestamp, value>);
//         }
        
//     }
    
//     public String get(String key, int timestamp) {
        
//     }

//     private static class Pair{

//         //제네릭 클래스
//         int timestamp;
//         String value;

//         Pair(int timestamp , String value){
//             this.timestamp = timestamp;
//             this.value = value;
//         }
//     }
// }

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

//  import java.util.Scanner;

//  public class Solution{

//     public void matrix_output(int [][] matrix){
//         swap_matrix(matrix);
//         rotate_matrix(matrix);
        
//     }
//     public void rotate_matrix(int [][] matrix){
//         int width =  matrix[0].length;
//         int height = matrix.length;
        
//         int right =width; 
//         int left = 0;

//         for(int i =0 ;i <height ; i++){
//               while(left < right){

//                 int temp = matrix[i][right];
//                 matrix[i][right] = matrix[i][left];
//                 matrix[i][left] = temp;
//             }
//         }
        
//     }
//     public void swap_matrix(int [][] matrix){

//         int width = matrix[1].length;

//         int height  = matrix.length;

//         for(int i =0 ; i< height ; i++){

//             for(int k =0 ; k< width ; k++){

//                 int temp = matrix[i][k];
//                 matrix[i][k]= matrix[k][i];
//                 matrix[k][i] = temp;
//             }
//         }
//     }
//     public static void main(String args){
//         int width = 0;
//         int height =0;
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("width size: ");
//         width = scanner.nextInt();
//         System.out.print("height size : ");
//         height = scanner.nextInt();
//         int[][] matrix = new int[width][height];
//         for(int i =0 ; i< height ; i++){
//             for(int k =0 ; k< width ; k++){
//                 System.out.print(i+"row "+k+"column"+" matrix value : ");
//             }
//         }
//         Solution solution = new Solution();
//         solution.matrix_output(matrix);
//         for(int i =0 ; i< height ; i++){
//             for(int k =0 ; k< width ; k++){
//                 System.out.print(matrix[i][k]);
//             }
//             System.out.print("\n");
//         }
//     }
//  }
// import java.util.Scanner;
// import java.util.Stack;
// class Solution {
//     public boolean isValid(String s) {
//         int length = s.length(); 
//         if(length <= 1){
//             return false;
//         }
//         char[] array = s.toCharArray();
//         char compare_char;
//         Stack<Character> stack = new Stack<>();
//         for(int i =0 ; i<length ; i++){
//             if(array[i] == '['||array[i] == '{'||array[i] == '('){    
//                 stack.push(s.charAt(i));
//             }else if((array[i] == ']'||array[i] == '}'||array[i] == ')')){
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 compare_char = stack.pop();
//                 if(array[i] == ')'){
//                     if(compare_char =='('){
//                         continue;
//                     }else{
//                         return false;
//                     }
//                 }        
//                 if(array[i] == '}'){
//                     if(compare_char =='{'){
//                         continue;
//                     }else{
//                         return false;
//                     }
//                 }             
//                 if(array[i] == ']'){
//                     if(compare_char =='['){
//                         continue;
//                     }else{
//                         return false;
//                     }
//                 }
//             }       
//         }
//      if(stack.isEmpty()){
//         return true;
//      }else{
//         return false;
//      } 
//     }
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//     }
// }
// import java.util.Scanner;
// class Solution {
//     public int solution(int[] schedules, int[][] timelogs, int startday) {
//         int result = 0;
//         int size = schedules.length;
//         if(timelogs[0].length != 7){
//             return 0;
//         }
//         for (int i = 0; i < size; i++) {
//             int current_day = startday;
//             int count = 0;
//             int not_weekend =0;
//             for (int k = 0; k < 7; k++) {
//                 if (current_day != 6 && current_day != 7) {
//                     not_weekend++;
//                     if ( timelogs[i][k] <= schedules[i] + 10 && timelogs[i][k]%100<=59) {
//                         count++;
//                     }
//                 }
//                 current_day = (current_day % 7) + 1;
//             }
//             if (count == 5 && not_weekend == 5) {
//                 result++;
//             }
//         }
//         return result;
//     }
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         Solution solution = new Solution(); 
//     }
// }
// import java.util.Scanner;
// import java.util.Arrays;
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int hay_length = haystack.length();
//         int needle_length = needle.length();
//         char[] arr = new char[haystack.length()];
//             int left = 0 ;
//             int right = hay_length-1;
//             int index =0;
//         while(left < right){
//             if(arr[left] == needle.charAt(index)){
//                 right = left + (needle_length-1);
//                 if(arr[right] == needle.charAt(right)){
//                     left++;
//                     right--;
//                 }
//             }
//         }
//         public static void main(String args[]){
//             Scanner scanner = new Scanner(System.in);
//             Solution solution = new Solution();
//         }
//     }
// }

// import java.util.Scanner;

// public class Solution{

//     void swap_matrix(int[][] matrix){

//         int length = matrix.length;
//         int left =0;
//         int right = length -1;

//         for(int i =0 ; i< length ; i++){
//         while(left < right){

//             int temp = matrix[i][left];
//             matrix[i][left] = matrix [i][right];
//             matrix[i][right] = temp;}
//         }
//     }
//     public static void main( String args[]){

//         Scanner scanner =  new Scanner(System.in);
//         Solution solution = new Solution();
//         int size = scanner.nextInt();
//         int[][] matrix = new int[size][size];

//         for(int i =0 ; i<size ; i ++ ){
//             for(int  k = 0 ; k<size ; k++){
//                 System.out.println(i + " "+k+ " input ");
//                 matrix[i][k] = scanner.nextInt();
//             }
//         }
//         solution.swap_matrix(matrix);

//         for(int i =0 ; i< size ; i++){
//             for(int k =0 ; k< size ; k++ ){
//                 System.out.print(matrix[i][k]);
//             }
//         }        
//     }
// }


// import java.util.*;

// class Solution {

//     private int[][] image;
//     private int originalColor , newColor;
//     private int rows, cols;

//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         this.image = image;
//         this.rows = image.length;
//         this.cols = image[0].length;
//         this.originalColor = image[sr][sc];
//         this.newColor = color;

//         if(originalColor == newColor){
//             return image;

//         }

//         dfs(sr,sc);

//         return this.image;
        
//     }

//     private void dfs(int r, int c){
//         if(r< 0 || r>= rows || c<0 ||c>=cols){
//             return;

//         }


//         if(image[r][c] != originalColor){
//             return;
//         }


//         image[r][c] = newColor;
//         dfs(r+1, c);
//         dfs(r-1, c);

//         dfs(r,c+1);
//         dfs(r,c-1);
//     }
// }



// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */

// c/**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return isValid(root, null, null);   
//     }
//     public boolean isValid(TreeNode node, Integer min , Integer max){

//         if( node == null ){
//             return true;
//         }
//         if((min != null&& node.val<min)||(max!= null && node.val > max)){
//         return false;    
//        }
//         return isValid(node.left , min , node.val)&& isValid(node.right, node , max);
//     }
// }
import java.util.*;
public class leetcode230 {
    
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     int count =0;
//     int result =0;
//     public int kthSmallest(TreeNode root, int k) {

//         bstCounter(root , k);

//         return result;

//     }

//     public void bstCounter(TreeNode node , int k){
//         if(node == null){
//             return;
//         }

//         bstCounter(node.left , k);
//         count++;

//         if(count == k){
//             result = node.val;
//             return ;
//         }
//         bstCounter(node.right , k);

//     }

// }
