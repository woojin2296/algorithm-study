import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] sort_arr = arr.clone();
        Arrays.sort(sort_arr);
        for (int i : arr) {
            if (i == sort_arr[0]) {
                continue;
            }
            list.add(i);
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}