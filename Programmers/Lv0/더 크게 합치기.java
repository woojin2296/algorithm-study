class Solution {
    public int solution(int a, int b) {
        int ab = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
        int answer = ab > ba ? ab : ba;
        return answer;
    }
}