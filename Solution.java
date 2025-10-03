import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {

        int length = nums.length;

        int sum = 0;
        int result=0;
        

        for(int i =0 ; i<length ; i++){
            sum += nums[i];
        }

        int left =0;
        int right = sum;

        for(int i =0 ; i< length ; i++){
            if(left >0)
            {
            left += nums[i-1];}

            right -= left;

            System.out.println(left,right);
            
            if(right == left){
                result = i;
            }
        }

        return result;
        
    }

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] input =  new int[6];

        input[] = (1,7,3,6,5,6);

        int result = solution.pivotIndex(input);

        System.out.println(result);


    }
}


