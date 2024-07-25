class Solution {
    public int solution(int[] num_list) {
        boolean big = num_list.length > 10;
        
        int answer = big ? 0 : 1;
        for (int i : num_list) {
            answer = big ? answer + i : answer * i;
        }
        return answer;
    }
}