import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {

        int length = nums.length;
        int sum = 0;

        for(int i =0 ; i<length ; i++){
            sum += nums[i];
        }

        int rightSum=0;
        int leftSum =0;
        int left =0;
        int cal=0;


        for(int i =0 ; i<length ; i++){
            left = i -1;
            if(left <0 ){
                leftSum = 0;

            }else{
                leftSum += nums[left];

            }

            cal += nums[i];
            rightSum = sum-cal;

            System.out.println(i+" : "+leftSum+ " " + rightSum);

            if(leftSum == rightSum){
                return i;
            }


        }
        return -1;
    }

}
