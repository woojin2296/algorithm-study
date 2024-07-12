class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if (num % 2 == 0) {
            int sum = total / (num / 2);
            int start = sum / 2 - (num / 2) + 1;
            for (int i = 0; i < num; i++) {
                answer[i] = start++;
            }
            return answer;
        }
        else {
            int mid = total / num;
            answer[num/2] = mid;
            
            int index1 = 1;
            for (int i = num/2 - 1; i >= 0; i--) {
                answer[i] = mid - index1++;
            }
            
            int index2 = 1;
            for (int i = num/2 + 1; i < num; i++) {
                answer[i] = mid + index2++;
            }
            
            return answer;
        }
    }
}