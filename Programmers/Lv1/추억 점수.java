import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();        
        int i = 0;
        for (String n : name) {
            score.put(n, yearning[i++]);
        }
        
        System.out.println(photo.length);
        int[] answer = new int[photo.length];
        int j = 0;
        for (String[] p : photo) {
            int n = 0;
            for (String pp : p) {
                if (score.containsKey(pp)) {
                    n = n + score.get(pp);
                }
            }
            answer[j++] = n;
        }
        
        return answer;
    }
}