class Solution {
    public String solution(String code) {
        
        boolean mode = false;
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            
            if (!mode && i%2 == 0) {
                answer = answer + code.charAt(i);
                continue;
            }
            if (mode && i%2 != 0) {
                answer = answer + code.charAt(i);
                continue;
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}