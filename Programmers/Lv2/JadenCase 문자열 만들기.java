import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String[] s_list = s.split(" ", -1);
        
        for (int i = 0; i < s_list.length; i++) {
            if (s_list[i] == null || s_list[i].length() == 0) continue;
            
            char c = s_list[i].charAt(0);
            if (c >= 'a' && c <= 'z') {
                s_list[i] = s_list[i].replaceFirst(c + "", Character.toUpperCase(c) + "");
            }
        }
        
        return String.join(" ", s_list);
    }
}