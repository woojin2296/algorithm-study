import java.math.*;

class Solution {
    public int solution(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        int gcd = b1.gcd(b2).intValue();
        
        int num = b / gcd;
        
        while (true) {
            if (num == 1) return 1;
            if (num % 2 == 0) {
                num /= 2;
            }
            else if (num % 5 == 0) {
                num /= 5;
            }
            else {
                return 2;
            }
        }
    }
}