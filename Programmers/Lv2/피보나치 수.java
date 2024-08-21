class Solution {
    public int solution(int n) {
        return F(n);
    }
    
    public int F(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (F(n-2) + F(n-1)) % 1234567;
    }
}