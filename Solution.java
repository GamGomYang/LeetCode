import com.sun.tools.javac.Main;
import java.util.Scanner;
import java.uitl.List;
import java.util.Arrays;


class Solution {
    public String longestPalindrome(String s) {

        int length = s.length();

        StringBuilder sb  = new StringBuilder();

        int left =0;
        int right = length;

        char[] chars = new char[length];
        chars = s.toCharArray();

        for(int i=0 ; i<length-1; i++){

            if(chars[left] == chars[right]){
                right--;
                left++;
            }
            else{
                right--;
            }
        
        }
    }

    public static void main(String[] args){

    Solution solution = new Solution();

    Scanner scanner = new Scanner(System.in);

    System.out.println(" input ");
    
    String input = scanner.nextLine();

    String result;

    result = solution.longestPalindrome(input);

    System.out.println(result);



    
    }
}
