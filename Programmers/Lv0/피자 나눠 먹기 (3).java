class Solution {
    public int solution(int slice, int n) {
        int num = 1;
        
        while (true) {
            if ((slice * num) >= n) return num;
            num++;
        }
    }
}