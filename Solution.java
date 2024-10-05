import java.util.Scanner;
import java.util.List;
import java.util.Stack;
import java.io.*;

/*
 * regular expression
 * 
 * 1. * -> 0개에서 n개까지 반복
 * 2. . -> 아무 문자
 * 
 * ex: a*.* == aabb
 */

public class Solution{
    public boolean isMatch(String s, String p){

        int s_len = s.length();
        int p_len = p.length();

        boolean dp[][] = new boolean[s_len-1][p_len-1];
        dp[0][0]=true;

        for(int j=2 ; j<= p_len ; j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-2];            }
        }
        
    }
}