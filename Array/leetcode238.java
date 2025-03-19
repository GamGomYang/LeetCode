import java.util.Scanner;
import java.util.List;

public class Solution{
    public int[] productExceptSelf(int[] nums) {
     
        int length = nums.length;
        int right=1;
        int left =1;
        int result[] = new int[length];


     for(int i=0 ; i<length ; i++){

        result[i] = left;
        left *= nums[i];
     }

     for(int i=length-1; i>=0 ; i--){
        result[i] *= right;
        right *= nums[i];
     }


      return result;
    }

}