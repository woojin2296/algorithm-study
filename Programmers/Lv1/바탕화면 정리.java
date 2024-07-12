class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {0,0,0,0};
        
        boolean first = true;
        int currentY = 0;
        for (String s : wallpaper) {
            int fIndex = s.indexOf('#');
            int lIndex = s.lastIndexOf('#');
            
            if (fIndex != -1 && first) {
                answer[0] = currentY;
                answer[1] = fIndex;
                first = false;
            }
            
            if (fIndex != -1) {
                if (fIndex < answer[1]) {
                    answer[1] = fIndex;
                }
                if (lIndex > answer[3]) {
                    answer[3] = lIndex;
                }
                answer[2] = currentY;
            }
            currentY++;
            System.out.printf("%d, %d / %d, %d \n", answer[0], answer[1], answer[2], answer[3]);
        }
        answer[2] += 1;
        answer[3] += 1;
        return answer;
    }
}