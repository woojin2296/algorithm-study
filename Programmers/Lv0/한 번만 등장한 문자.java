import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : s.split("")) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            }
            else {
                map.put(str, map.get(str) + 1);
            }
        }
        
        String answer = "";
        for (String str : map.keySet()) {
            if (map.get(str) == 1) {
                answer += str;
            }
        }
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        
        return answer;
    }
}