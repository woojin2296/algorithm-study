import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            set.add(i);
        }
        
        return set.size() > nums.length / 2 ? nums.length / 2 : set.size();
    }
}