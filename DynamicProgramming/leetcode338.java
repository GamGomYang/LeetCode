/*
//solution 1 :브르트 포스 -> time exceed

import java.util.*;

public class solution {

    public int[] countBits(int n){

        int[] answer =  new int[n+1];

        for(int i =0 ; i<= n ; i++){

            answer[i] = counter(i);
        }

        return answer;
    }

    public int counter(int k){
        int count = 0;
        while(k>0){

            count += (k % 2);
            k>>= 1;

        }

        return count;
    }
}*/

//solution2 : dp사용

import java.util.*;

class Solution{
    public int[] countBits(int n){

        int[] dp = new int[n+1];
        dp[0] = 0;

        for(int i =0 ; i<= n ; i++){

            dp[i] = dp[i>>1]+(i%2);
        }

        return dp;
    }
}