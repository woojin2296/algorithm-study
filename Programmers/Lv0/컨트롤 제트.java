import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int memory = 0;
        for (String string : s.split(" ")) {
            if (string.equals("Z")) {
                answer -= memory;
                continue;
            }           
            
            int num = Integer.valueOf(string);
            answer += num;
            memory = num;
        }
        return answer;
    }
}