class Solution {
    public String solution(String phone_number) {
        char[] list = phone_number.toCharArray();
        
        for (int i = 0; i < list.length - 4; i++) {
            list[i] = '*';
        }
        
        return new String(list);
    }
}