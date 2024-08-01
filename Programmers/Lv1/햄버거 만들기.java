import java.util.*;

class Solution {
    public int solution(int[] ing) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i : ing) {
            stack.push(i);
            
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {
                    
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    count++;
                }
            }
        }

        return count;
    }
}
