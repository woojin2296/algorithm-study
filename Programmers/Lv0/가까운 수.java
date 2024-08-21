import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = 100000000;
        for (int i : array) {
            if (Math.abs(answer - n) > Math.abs(i - n)) {
                answer = i;
            }
        }
        
        return answer;
    }
}