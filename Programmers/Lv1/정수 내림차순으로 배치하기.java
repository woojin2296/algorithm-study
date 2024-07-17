import java.util.*;

class Solution {
    public long solution(long n) {
        char[] c_list = String.valueOf(n).toCharArray();
        Arrays.sort(c_list);
        StringBuffer sb = new StringBuffer(new String(c_list));
        return new Long(sb.reverse().toString());
    }
}