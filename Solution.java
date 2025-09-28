import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        
        Arrays.fill(answer,1);

        int left=1;
        for(int i =0 ; i<length ; i++){

            answer[i] = left;
            left *= nums[i];
        } 

        int right =1;
        for(int i = length-1 ; i>=0 ; i--){
            answer[i] *= right;
            right *= nums[i];

        }

        return answer;
    }
}