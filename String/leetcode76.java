import java.util.HashMap;

class Solution {
   public String minWindow(String s, String t) {

      //예외처리
      if(s.length() == 0 || t.length() == 0){
         return "";
      }

      int left =0;
      int right = 0;

      int count =0;

      HashMap<Character,Integer> goal = new HashMap<>();
      HashMap<Character, Integer> pointer =  new HashMap<>();

   
      for(char c : t.toCharArray()){
         goal.put(c,goal.getOrDefault(c, 0)+1);


      }

      int start =0;
      int len = Integer.MAX_VALUE;

      while(right<s.length()){
         char c =s.charAt(right);
         right++;

         if(goal.containsKey(c)){
            pointer.put(c,pointer.getOrDefault(c, 0)+1);

            if(pointer.get(c).equals(goal.get(c))){
               count++;
            }


         }
      
      while(count == goal.size()){
         if(right - left <len){
            start = left;
            len = right - left;
         }

         char d = s.charAt(left);
         left++;


         if(goal.containsKey(d)){
            if(pointer.get(d).equals(goal.get(d))){
               count--;

            }

            pointer.put(d, pointer.get(d)-1);
         }
      }

       
   }
   return len == Integer.MAX_VALUE ? "" : s.substring(start,start+len);

}}