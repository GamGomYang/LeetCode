import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;


//leetcode 9


public class Leetcode9{

    public boolean isPalindrome(int x){

        if(x<0){
            return false;
        }

        //정수 배열 처리 -> 숫자를 문자열 처리하여서 배열로 처맄
        String string = String.valueOf(x);
        int left =0;
        int right = string.length()-1;

        while(right>left){

            if(string.charAt(left)!= string.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
        

    }}