import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        boolean isS1Big = s1.length > s2.length;
        
        for (String s : isS1Big ? s2 : s1) {
            if (isS1Big ? Arrays.asList(s1).contains(s) : Arrays.asList(s2).contains(s) ) {
                answer++;
            }
        }
        return answer;
    }
}