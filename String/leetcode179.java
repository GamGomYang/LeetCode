import java.util.Arrays;
class Solution {
   public String largestNumber(int[] nums) {


      StringBuilder sb = new StringBuilder();

      int length = nums.length;   
      String [] number = new String[length];

      for(int i =0; i<length ;i++){

         number[i] = String.valueOf(nums[i]);
      }

      Arrays.sort(number,(a,b)-> (b+a).compareTo(a+b));

   
      if(number[0].equals("0"))
      {
         return "0";

      }

      for(String str : number){
         sb.append(str);
      }

      return sb.toString();
       
   }
}