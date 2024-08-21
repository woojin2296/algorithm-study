import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) list.add(n / i);
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}