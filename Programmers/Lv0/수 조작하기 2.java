class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int save = 0;
        for (int i : numLog) {
            if (i - save == 1) {
                answer = answer + "w";
            }
            else if (i - save == -1) {
                answer = answer + "s";
            }
            else if (i - save == 10) {
                answer = answer + "d";
            }
            else if (i - save == -10) {
                answer = answer + "a";
            }
            
            save = i;
        }
        
        
        
        return answer;
    }
}