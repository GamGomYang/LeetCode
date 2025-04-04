import java.util.HashMap;

public class Solution{

public int longestPalindrome(String s) {
   HashMap<Character,Integer> hashmap =  new HashMap<>();
   
   for(char c : s.toCharArray()){
      hashmap.put(c,hashmap.getOrDefault(c, 0)+1);
   }

   int length = 0;
   boolean single_string = false;

   for(int count: hashmap.values()){

      if(count % 2 ==0){
         length += count;

      }

      else{
         length += count -1;
         single_string = true;
      }
   }


   return single_string ? length +1 : length;


}
}