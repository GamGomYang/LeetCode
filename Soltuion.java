import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;


//leetcode 8번 문제 확인


public class Soltuion{

    public boolean isPalindrome(int x){
        int [] result = Stream.of(String.valueOf(x).split(""))
        .mapToInt(Integer::parseInt)
        .toArray();

        int length = result.length;
       
        


        int right =0;
        int left =length-1;


        while(right<left){
            if(result[right]==result[left]){
                right++;
                left--;

            }
            else if(result[right]!=result[left]){

                return false;
            }

            return true;
            
        }


        
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();

    }
}