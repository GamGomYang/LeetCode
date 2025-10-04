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

        for(int i =0 ; i<length ; i++){

            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];

            System.out.println(i+" : "+leftSum+ " " + rightSum);

        }
        return -1;
    }

}
