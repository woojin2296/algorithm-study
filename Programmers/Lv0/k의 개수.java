class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int num = i; num <= j; num++) {
            sb.append(num);
        }
        
        String str = sb.toString();
        
        int pre = str.length();
        int aft = str.replaceAll(k + "", "").length();
        
        return pre - aft;
    }
}