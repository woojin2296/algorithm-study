class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int index = 0;
        for (String s : quiz) {
            String[] arr = s.split(" ");
            
            int num1 = Integer.valueOf(arr[0]);
            int num2 = Integer.valueOf(arr[2]);
            int result = Integer.valueOf(arr[4]);
            
            if (arr[1].equals("+")) {
                if (num1 + num2 == result) answer[index] = "O";
                else answer[index] = "X";
            }
            else {
                if (num1 - num2 == result) answer[index] = "O";
                else answer[index] = "X";
            }
            index++;
        }
        
        return answer;
    }
}