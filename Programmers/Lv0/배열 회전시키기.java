class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int index = direction.equals("right") ? 1 : numbers.length - 1;
        
        for (int i : numbers) {
            answer[index++ % numbers.length] = i;
        }
        
        
        return answer;
    }
}