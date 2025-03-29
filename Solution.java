import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {

      //해시 테이블 선언
      HashMap<String, List<String>> hashmap = new HashMap<>();

      for (String s : strs) {

         char[] chars = s.toCharArray();
         Arrays.sort(chars);
         String sorting = new String(chars);
        // 만약 정렬된 단어가 존재한다면? -> 값에 단어 삽입
        // 존재하지 않는다면? -> 새로운 ArrayList 생성후 단어 삽입
         hashmap.computeIfAbsent(sorting, k -> new ArrayList<>()).add(s);
      }

      //최종 값 (애너그램) 출력
      return new ArrayList<>(hashmap.values());
   }
}
