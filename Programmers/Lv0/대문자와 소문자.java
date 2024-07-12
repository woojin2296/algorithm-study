class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            if (s.charAt(0) > 96) {
                answer += s.toUpperCase();
            }
            else {
                answer += s.toLowerCase();
            }
        }
        return answer;
    }
}