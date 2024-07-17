class Solution {
    public int[] solution(long n) {
        char[] c_arr = String.valueOf(n).toCharArray();
        int[] answer = new int[c_arr.length];
        
        int index = c_arr.length - 1;
        for (char c : c_arr) {
            answer[index--] = c - '0';
        }
        return answer;
    }
}