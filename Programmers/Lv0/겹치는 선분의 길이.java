class Solution {
    public int solution(int[][] lines) {
        int[] line = new int[200];
        int count = 0;
        
        for (int[] l : lines) {
            for (int i = l[0]; i < l[1]; i++) {
                if (line[100+i] == 1) {
                    count++;
                    line[100+i] = 2;
                }
                else if (line[100+i] == 0) {
                    line[100+i] = 1;
                }
            }
        }
        
        return count;
    }
}