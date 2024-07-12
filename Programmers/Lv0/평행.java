class Solution {
    public int solution(int[][] d) {
        
        double[] slope = new double[6];
        
        slope[0] = (double)(d[0][1] - d[1][1]) / (double)(d[0][0] - d[1][0]);
        slope[1] = (double)(d[0][1] - d[2][1]) / (double)(d[0][0] - d[2][0]);
        slope[2] = (double)(d[0][1] - d[3][1]) / (double)(d[0][0] - d[3][0]);
        slope[3] = (double)(d[1][1] - d[2][1]) / (double)(d[1][0] - d[2][0]);
        slope[4] = (double)(d[1][1] - d[3][1]) / (double)(d[1][0] - d[3][0]);
        slope[5] = (double)(d[2][1] - d[3][1]) / (double)(d[2][0] - d[3][0]);

        
        if (slope[0] == slope[5]) {
            return 1;
        }
        if (slope[1] == slope[4]) {
            return 1;
        }
        if (slope[2] == slope[3]) {
            return 1;
        }
        return 0;
    }
}