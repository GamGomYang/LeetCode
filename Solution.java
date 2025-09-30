import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        StringBuilder sb = new StringBuilder();

        int length = nums.length;

        String[] num = new String[length];

        for(int left = 0 ; left <length -1 ; left++ ){

            for(int right= left +1 ; right < length ; right++){

                if(num[left].charAt(0) <= num[right].charAt(0)
                &&
                num[left].length > num[right].length){
                    int temp;
                    num[left]= temp;
                    num[left] = num[right];
                    num[right] = temp; 
                }
            }
        }
        for(int i =0 ; i< length ; i++){
            sb.append(Integer.toString(num[i]));
        }
        String result = sb.toString();
        return result;
        
    }
}