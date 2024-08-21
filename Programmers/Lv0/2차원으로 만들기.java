class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        int a = 0;
        for (int i : num_list) {
            answer[a / n][a++ % n] = i;
        }
        
        
        return answer;
    }
}