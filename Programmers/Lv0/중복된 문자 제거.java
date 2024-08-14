class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (String c : my_string.split("")) {
            if (!answer.contains(c)) {
                answer += c;
            }
        }
        
        
        return answer;
    }
}