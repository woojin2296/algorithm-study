import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    if (map.get(c) > i + 1) {
                        map.put(c, i + 1);
                    }
                }
                else {
                    map.put(c, i + 1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            answer[i] = 0;
            try {
                for (int k = 0; k < targets[i].length(); k++) {
                    answer[i] += map.get(targets[i].charAt(k));
                }
            } catch (Exception e) {
                answer[i] = -1;
            }
            
        }
        
        return answer;
    }
}