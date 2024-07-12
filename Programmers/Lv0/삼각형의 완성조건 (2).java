class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int s1 = sides[0];
        int s2 = sides[1];
        
        if (sides[0] > sides[1]) {
            s1 = sides[1];
            s2 = sides[0];
        }
        
        answer = s1 + s2 - (s2 - s1) - 1;
        
        return answer;
    }
}