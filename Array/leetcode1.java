import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;


public class leetcode1{

    public int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> hashmap = new HashMap<>();


        for(int i =0 ; i<nums.length;i++){
            hashmap.put(nums[i],i);



        }


        for(int i=0; i< nums.length; i++){
            if(hashmap.containsKey(target-nums[i])&& i != hashmap.get(target- nums[i])){

                return new int[] { i, hashmap.get(target-nums[i])};


            }
        }

        return null;

    }

}

