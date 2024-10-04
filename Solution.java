import java.util.Scanner;
import java.util.List;
import java.io.*;

public class Solution{

    public boolean isMatch(int x){
        String string = String.valueOf(x);
        int length = string.length();

        int right = length;
        int left = 0;

        if(x<0){
            return false;
        }
        while(right > left){
            if(string.charAt(left)==string.charAt(right)){
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
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        Solution solution = new Solution();
        boolean b_result = solution.isMatch(result);
        System.out.println(b_result);
    }
}