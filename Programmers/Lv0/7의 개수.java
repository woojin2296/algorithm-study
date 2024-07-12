import java.util.*;

class Solution {
    public int solution(int[] array) {
        String s = Arrays.toString(array);
        String s2 = s.replaceAll("7", "");
        
        return s.length() - s2.length();
    }
}