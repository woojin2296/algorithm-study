class Solution {
    public int[][] solution(int n) {
        
        int[][] dir = { {0, +1}, {+1, 0}, {0, -1}, {-1, 0} };
        int[][] answer = new int[n][n];
        int value = 1, r = 0, c = 0, mode = 0;
        
        while(value < n*n + 1) {
            answer[r][c] = value++;
            
            try {
                if (answer[r + dir[mode][0]][c + dir[mode][1]] != 0) {
                    mode = (mode+1)%4;
                }
            }
            catch(Exception e) {
                mode = (mode+1)%4;
            }
            r += dir[mode][0];
            c += dir[mode][1];
        }
        return answer;
    }
}