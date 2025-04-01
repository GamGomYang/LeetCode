import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(candidates);
         backtracking(candidates, target, 0, new ArrayList<>(), result);
         return result;
    }

    private void backtracking(int[] candidates, int target, int startIndex, List<Integer> current, List<List<Integer>> result) {
         if (target == 0) {
              result.add(new ArrayList<>(current));
              return;
         }

         for (int i = startIndex; i < candidates.length; i++) {
              int pick = candidates[i];

              if (pick > target) {
                    break;
              }
              if (i > startIndex && candidates[i] == candidates[i - 1]) {
                    continue;
              }

              current.add(pick);
              backtracking(candidates, target - pick, i, current, result);
              current.remove(current.size() - 1);
         }
    }
}
