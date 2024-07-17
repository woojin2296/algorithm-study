class Solution {
    private int count = 0;
    private int zero = 0;
    
    public int[] solution(String s) {
        binaryConversion(s);
        int[] answer = { count, zero };
        return answer;
    }
    
    private void binaryConversion(String s) {
        if (s.equals("1")) return;
        
        int len = s.length();
        s = s.replaceAll("0", "");
        zero += len - s.length();
        
        s = Integer.toBinaryString(s.length());
        
        count++;
        
        binaryConversion(s);
    }
}