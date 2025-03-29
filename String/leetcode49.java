import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> hashmap = new HashMap<>();

      for (String s : strs) {

         char[] chars = s.toCharArray();
         Arrays.sort(chars);
         String sorted = new String(chars);

         hashmap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
      }

      return new ArrayList<>(hashmap.values());
   }
}



