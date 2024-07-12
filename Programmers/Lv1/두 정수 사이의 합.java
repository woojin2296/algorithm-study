class Solution {
    public long solution(int a, int b) {
        return a == b ? a : a > b ? ((long)(a-b+1)*(long)(a+b))/2 : ((long)(b-a+1)*(long)(a+b))/2;
    }
}