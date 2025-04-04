import java.util.Scanner;
import java.util.List;
import java.util.Deque;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // sorted array -> index searching
        // if target number not existed in nums[i]
        // solution ->  sorted searching -> correct



        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;


    }
}
