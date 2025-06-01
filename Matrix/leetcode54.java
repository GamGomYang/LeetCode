import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (result.size() < rows * cols) {
            for (int i = left; i <= right && result.size() < rows * cols; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && result.size() < rows * cols; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left && result.size() < rows * cols; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && result.size() < rows * cols; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }
}