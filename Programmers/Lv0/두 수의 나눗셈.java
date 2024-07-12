class Solution {
    public int solution(int num1, int num2) {
        double n1 = Double.valueOf(num1);
        double n2 = Double.valueOf(num2);
        
        int a = (int) (n1 / n2 * 1000);
        return a;
    }
}