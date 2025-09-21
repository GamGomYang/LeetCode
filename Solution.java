import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );

        for (int[] point : points) {
            minHeap.add(point);
        }

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = minHeap.poll();
        }

        return answer;
    }
}
