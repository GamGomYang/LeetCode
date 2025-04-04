import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;

        for(int i=0 ; i<length ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;

    }

}