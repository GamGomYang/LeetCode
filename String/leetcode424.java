
class Solution {
   public int characterReplacement(String s, int k) {

     int[] count = new int[26];

      int left =0;
      int max_count =0;
      int max_len =0;

      for(int right =0 ;right<s.length();right++){
        char ch = s.charAt(right);

        count[ch-'A']++;
        max_count = Math.max(max_count, count[ch -'A']);

        if((right - left +1)-max_count >k){
         count[s.charAt(left) -'A']--;
         left++;
        }
 
        max_len = Math.max(max_len, right-left +1);
            }


            return max_len;

       
   }
}