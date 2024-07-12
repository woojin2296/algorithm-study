import java.util.*;

class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}