import java.util.*;
import java.math.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        
        return (dots[2][0] - dots[0][0]) * Math.abs(dots[0][1] - dots[1][1]);
    }
}