import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> result = new ArrayList<>();
        for (int i : numlist) {
            if (i%n == 0) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}