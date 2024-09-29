import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;


public class Solution{


    public boolean isPalindrome(int x){

        if(x<0){
            return false;
        }
        String string = String.valueOf(x);
        int length = string.length();

        int right = length;
        int left =0;

        while(left<right){

            if(string.charAt(right)== string.charAt(left)){

                right--;
                left++;
            }

            else{
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        
      Scanner scanner =  new Scanner(System.in);
      int result = scanner.nextInt();
      Solution solution = new Solution();

      solution.isPalindrome(result);
    }
}