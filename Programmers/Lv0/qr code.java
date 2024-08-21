class Solution {
    public String solution(int q, int r, String code) {
        String str = "";
        
        int index = 0;
        for (String s : code.split("")) {
            if (index % q == r) {
                str += s;
            }
            index++;
        }
        
        return str;
    }
}