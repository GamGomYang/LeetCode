public class Solution{

    public int removeDuplicates(int[] nums){

        if(nums.length == 0){

            return 0;
        }
        int length = nums.length;

        int right =0;
        int left=1;

        while(left<length){

            if(nums[right]== nums[left]){
                left++;
            }
            else if(nums[right]!=nums[left]){
                right++;
                nums[right]=nums[left];

            }



        }
        return right+1;
    }
}