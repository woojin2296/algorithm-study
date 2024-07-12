import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        for (int[] q : queries) {
            int min = 1000001;
            for (int i = q[0]; i <= q[1]; i++) {
                if (arr[i] > q[2] && arr[i] < min) {
                    min = arr[i];
                }
            }
            if (min == 1000001) min = -1;
            answer[index++] = min;
        }
        return answer;
    }
}