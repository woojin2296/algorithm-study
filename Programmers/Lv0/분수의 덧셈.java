class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int totalD = denom1 * denom2;
        int totalN = numer1 * denom2 + numer2 * denom1;
        
        int gcd = totalN > totalD ? totalN : totalD;
        int r = totalN > totalD ? totalD : totalN;
        while(true) {
            int temp = gcd;
            gcd = r;
            r = temp % r;
            
            if (r == 0) break;
        }
        int[] result = { totalN / gcd, totalD / gcd };
        return result;
    }
}