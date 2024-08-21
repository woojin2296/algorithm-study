class Solution {
    public int solution(String my_string) {
        String[] list = my_string.toLowerCase().split("[a-z]+");
        
        int answer = 0;
        for (String s : list) {
            if (!s.equals("")) {
                answer += Integer.valueOf(s);
            }
        }
        
        return answer;
    }
}