class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        for (String str : s.split("")) {
            if (str.equals("p") || str.equals("P")) {
                countP++;
            }
            else if (str.equals("y") || str.equals("Y")) {
                countY++;
            }
        }
        return countP == countY;
    }
}