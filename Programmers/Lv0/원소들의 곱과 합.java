class Solution {
    public int solution(int[] num_list) {
        return product(num_list) < sum(num_list) ? 1 : 0;
    }
    
    private int product(int[] num_list) {
        int num = 1;
        for (int n : num_list) {
            num *= n;
        }
        return num;
    }
    
    private int sum(int[] num_list) {
        int num = 0;
        for (int n : num_list) {
            num += n;
        }
        return num*num;
    }
}