class Solution {
    public String solution(String s) {
        int max = -999999;
        int min = 999999;
        
        for (String str : s.split(" ")) {
            int num = Integer.valueOf(str);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return min + " " + max;
    }
}