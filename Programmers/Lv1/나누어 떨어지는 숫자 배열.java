import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}