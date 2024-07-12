import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] list = { a, b, c, d };
        Arrays.sort(list);
        
        if (list[0] == list[1] && list[1] == list[2] && list[2] == list[3]) {
            return 1111 * list[0];
        }
        
        if (list[0] == list[1] && list[1] == list[2]) {
            return (10 * list[0] + list[3]) * (10 * list[0] + list[3]);
        }
        if (list[1] == list[2] && list[2] == list[3]) {
            return (10 * list[1] + list[0]) * (10 * list[1] + list[0]);
        }
        
        if (list[0] == list[1] && list[2] == list[3]) {
            return (list[0] + list[2]) * (list[2] - list[0]);
        }
        
        if (list[0] == list[1]) {
            return list[2] * list[3];
        }
        if (list[1] == list[2]) {
            return list[0] * list[3];
        }
        if (list[2] == list[3]) {
            return list[0] * list[1];
        }
        
        if (list[0] != list[1] && list[1] != list[2] && list[2] != list[3]) {
            return list[0];
        }
        
        return 0;
    }
}