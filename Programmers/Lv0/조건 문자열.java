class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer;
        
        if (ineq.equals(">")) {
            answer = n > m;
        }
        else {
            answer = n < m;
        }
        
        if (!answer && eq.equals("=")) {
            answer = n == m;
        }
        
        return answer ? 1 : 0;
    }
}