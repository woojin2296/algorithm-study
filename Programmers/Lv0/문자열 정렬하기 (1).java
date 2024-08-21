import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        String s = "";
        
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                s = s + c;
            }
        }
        
        int[] answer = new int[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            answer[index++] = c - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}