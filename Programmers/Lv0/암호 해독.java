class Solution {
    public String solution(String cipher, int code) {
        int index = code - 1;
        String answer = "";
        while(index < cipher.length()) {
            answer += cipher.charAt(index);
            index += code;
        }
        return answer;
    }
}