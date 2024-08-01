class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean plus = true;
        for (String s : my_string.split(" ")) {
            if (s.equals("+")) plus = true;
            else if (s.equals("-")) plus = false;
            else {
                if (plus) {
                    answer += Integer.valueOf(s);
                }
                else {
                    answer -= Integer.valueOf(s);
                }
            }
        }
        
        return answer;
    }
}