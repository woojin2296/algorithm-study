class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = len % n == 0 ? len / n : len / n + 1;
        String[] answer = new String[size];
        
        for (int i = 0; i < size; i++) {
            try {
                answer[i] = my_str.substring(i*n, (i+1)*n);
            }
            catch(Exception e) {
                answer[i] = my_str.substring(i*n, len);
            }
        }
        
        
        return answer;
    }
}