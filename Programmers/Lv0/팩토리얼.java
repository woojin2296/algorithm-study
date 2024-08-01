class Solution {
    public int solution(int n) {
        int count = 1;
        int answer = 1;
        while(answer <= n) {
            answer *= count++;
        }
        return count - 2;
    }
}