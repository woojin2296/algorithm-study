class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] danger = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    try { danger[i-1][j-1] = 1; } catch(Exception e) {}
                    try { danger[i-1][j] = 1; } catch(Exception e) {}
                    try { danger[i-1][j+1] = 1; } catch(Exception e) {}
                    try { danger[i][j-1] = 1; } catch(Exception e) {}
                    try { danger[i][j] = 1; } catch(Exception e) {}
                    try { danger[i][j+1] = 1; } catch(Exception e) {}
                    try { danger[i+1][j-1] = 1; } catch(Exception e) {}
                    try { danger[i+1][j] = 1; } catch(Exception e) {}
                    try { danger[i+1][j+1] = 1; } catch(Exception e) {}
                }
            }
        }
    
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (danger[i][j] == 1) {
                    count++;
                }
            }
        }
    
        return n*n-count;
    }
}