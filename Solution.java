import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer , Integer> hashmap = new HashMap<>();

        int count = 0;
        int result =0;

        hashmap.put(0,-1);

        for(int i =0 ; i<nums.length ;i++){
            
            if(nums[i] == 0){
                count -=1;
            }
            else{
                count += 1;
            }

            if(hashmap.containsKey(count)){
                result = Math.max(result , i - hashmap.get(count));
            }
            else{
                hashmap.put(count , i);
            }

        }

        return result;

        
    }
}