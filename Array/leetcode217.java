import java.util.Scanner;
import java.util.Arrays;


//정렬후 인접 배열 비교

class Solution {
    public boolean containsDuplicate(int[] nums) {

    Arrays.sort(nums);
    int length = nums.length;
    boolean result = false;

    
    for (int i=0 ; i<length-1 ; i++ ){
        if(nums[i]==nums[i+1]){
            result = true;
        }
    }
    return result;

    }

}