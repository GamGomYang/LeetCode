/*class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;

        int answer =0;
        int right =0;
        int left;
        
        int compare =0;

        while(answer== 0){
            compare = nums[right];

            for(left =right+1 ; left <length; left ++){
                if(compare == nums[left]){

                    answer = compare;
                    break;
                }
            }

            right ++;
            
        }


        return answer;

        
    }
}*/

import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;

        Set<Integer> seen = new HashSet<>();
        int answer=0;

        for (int num : nums) {
            if (seen.contains(num)) {
                answer = num;
            }
            seen.add(num);
        }
        
        
        return answer;
    }
}

