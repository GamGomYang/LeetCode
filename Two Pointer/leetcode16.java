import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		Arrays.sort(nums);
		int min_nums = nums[0]+nums[1]+nums[2];
		int sum =0;
		for(int i =0 ; i< length-2; i++){
			int left = i+1;
			int right = length -1;

			while(left<right){
				sum = nums[i]+nums[left]+nums[right];
				if(Math.abs(sum-target)<Math.abs(min_nums-target)){
					min_nums = sum;
				}
				if(sum<target){
					left++;
				}
				else if(sum>target){
					right--;
				}
				else{
					return sum;
				}
			}
		}
		return min_nums;
    }
}