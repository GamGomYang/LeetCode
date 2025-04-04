import java.util.Scanner;
import java.util.List;
import java.util.Stack;
import java.io.*;

/*
 * regular expression
 * 
 * 1. * -> 0~n 
 * 2. . -> any charecter
 * 
 * ex: a*.* == aabb
 */

public class leetcode10{
    public boolean isMatch(String s, String p){

        int s_len = s.length();
        int p_len = p.length();

        boolean dp[][] = new boolean[s_len+1][p_len+1];
        dp[0][0]=true;

        for(int j=2 ; j<= p_len ; j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-2];
                        }
        }
        for(int i =1; i<= s_len; i++){
            for(int j =1 ; j<=p_len ; j++){
                char s_char = s.charAt(i-1);
                char p_char = p.charAt(j-1);
                if(s_char == p_char || p_char =='.'){
                    dp[i][j]= dp[i-1][j-1];
                }
                else if(p_char == '*'){
                    dp[i][j] = dp[i][j-2];
                    char p_pre_char = p.charAt(j-2);
                    if(p_pre_char == s_char || p_pre_char == '.'){
                        dp[i][j] |= dp[i-1][j];
                    }
                }
            }
        }

        return dp[s_len][p_len];
        
    }
}
