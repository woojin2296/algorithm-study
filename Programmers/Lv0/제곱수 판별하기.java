import java.math.*;

class Solution {
    public int solution(int n) {
        return Math.sqrt(n)*10%10 == 0 ? 1 : 2;
    }
}