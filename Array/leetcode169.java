import java.util.Scanner;


public class Solution{
    public int majorityElement(int[] nums){
        
        int number = nums [0], count =0;

        int length = nums.length;

        for(int i=0; i<length;i++){
            if(count == 0){
                number = nums[i];
            }

            count += (nums[i] == number)? 1:-1;
        }


        return number;


    }
}