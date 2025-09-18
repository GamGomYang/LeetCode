//LTC735 solving..

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        int length = asteroids.length;
        // 자바에서 절댓값 매서드 -> Math.abs
        for(int i =0 ; i< length ; i++){
            // int result = 0;

            // if(asteroids[i]>0){
            //     stack.push(asteroids[i]);
            // }else{
            //     int compare_1 = stack.pop();
            //     int compare_2 = Math.abs(asteroids[i]);

            //     if(compare_1 - compare_2 ==0){
            //         continue;
            //     }
            //     else if(compare2 > compare_1){


            //     }
            // }
            
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;

    }
}