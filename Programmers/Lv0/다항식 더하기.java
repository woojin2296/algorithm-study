class Solution {
    public String solution(String polynomial) {
        String[] list = polynomial.split(" \\+ ");
        
        int num = 0;
        int x = 0;
        for (String s : list) {
            if (s.contains("x")) {
                if (s.equals("x")) x += 1;
                else x += Integer.valueOf(s.replace("x", ""));
            }
            else {
                num += Integer.valueOf(s);
            }
        }
        
        String s_num = num + "";
        String s_x = x == 1 ? "" : x + "";
        
        return x == 0 ? (num == 0 ? "" : s_num) : (num == 0 ? s_x + "x" : s_x + "x + " + s_num);
    }
}