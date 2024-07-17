class Solution {
    public int solution(int n) {
        int index = 2;
        while (true) {
            if ( (n-1) % index++ == 0) return --index;
        }
    }
}