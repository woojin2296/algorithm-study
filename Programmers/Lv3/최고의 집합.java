import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        if (s == 1 || n > s) {
            return new int[] { -1 };
        }
        
        int[] answer = new int[n];
        Arrays.fill(answer, 0, n-s%n, s/n);
        Arrays.fill(answer, n-s%n, n, s/n + 1);
        
        return answer;
    }
}