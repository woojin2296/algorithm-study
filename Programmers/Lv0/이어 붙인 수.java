class Solution {
    public int solution(int[] num_list) {        
        String odd = "";
        String even = "";
        for (int i : num_list) {
            if (i%2 == 0) {
                even = even + i;
            }
            else {
                odd = odd + i;
            }
        }      
        
        return Integer.valueOf(odd) + Integer.valueOf(even);
    }
}