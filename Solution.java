import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> hashmap = new HashMap<>();

        int length = nums.length;
        hashmap.put(0,1);
        int sum=0;
        int result =0;

        for(int i =0 ; i< length ; i ++){
            sum += nums[i];

            if(hashmap.containsKey(sum-k)){
                result += hashmap.get(sum-k);
            }

            hashmap.put(sum , hashmap.getOrDefault(sum,0)+1);

        }

        return result;
        
    }
}