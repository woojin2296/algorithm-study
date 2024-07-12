class Solution {
    public String solution(String[] survey, int[] choices) {
        
        String answer = "";
        String def = "RCJA";
        String con = "TFMN";
        
        int[] per = { 0, 0, 0, 0 };
        
        // R C J A
        // T F M N
        
        for (int i = 0; i < survey.length; i++) {
            int cho = choices[i];
            char typ = survey[i].charAt(0);
            
            if (typ == 'R' && cho < 4) {
                per[0] += 4-cho;
            }
            if (typ == 'R' && cho > 4) {
                per[0] -= cho-4;
            }
            if (typ == 'T' && cho < 4) {
                per[0] -= 4-cho;
            }
            if (typ == 'T' && cho > 4) {
                per[0] += cho-4;
            }
            
            if (typ == 'C' && cho < 4) {
                per[1] += 4-cho;
            }
            if (typ == 'C' && cho > 4) {
                per[1] -= cho-4;
            }
            if (typ == 'F' && cho < 4) {
                per[1] -= 4-cho;
            }
            if (typ == 'F' && cho > 4) {
                per[1] += cho-4;
            }
            
            if (typ == 'J' && cho < 4) {
                per[2] += 4-cho;
            }
            if (typ == 'J' && cho > 4) {
                per[2] -= cho-4;
            }
            if (typ == 'M' && cho < 4) {
                per[2] -= 4-cho;
            }
            if (typ == 'M' && cho > 4) {
                per[2] += cho-4;
            }
            
            if (typ == 'A' && cho < 4) {
                per[3] += 4-cho;
            }
            if (typ == 'A' && cho > 4) {
                per[3] -= cho-4;
            }
            if (typ == 'N' && cho < 4) {
                per[3] -= 4-cho;
            }
            if (typ == 'N' && cho > 4) {
                per[3] += cho-4;
            }
            
        }
        
        for (int i = 0; i < per.length; i++) {
            answer += per[i] >= 0 ? def.charAt(i) : con.charAt(i);
        }
        
        return answer;
    }
}