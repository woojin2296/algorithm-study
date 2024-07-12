class Solution {
    public int solution(int a, int b) {
        int ab = Integer.valueOf("" + a + b);
        int ab2 = 2 * a * b;
        
        int answer = ab > ab2 ? ab : ab2;
        return answer;
    }
}