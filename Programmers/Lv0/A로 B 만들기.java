import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] b_list = before.toCharArray();
        char[] a_list = after.toCharArray();
        
        Arrays.sort(b_list);
        Arrays.sort(a_list);
        
        return new String(b_list).equals(new String(a_list)) ? 1 : 0;
    }
}