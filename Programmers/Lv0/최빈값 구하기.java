import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        int result = 0;
        int mode = 0;
        int index = 0;
        
        while(true) {
            int number = list.get(index);
            
            int last = list.lastIndexOf(number);
            int size = last + 1 - index;
            
            if (mode == size) {
                result = -1;
            }
            
            if (mode < size) {
                mode = size;
                result = number;
            }
            
            index = last + 1;
            
            if (index >= array.length) break;
        }
        
        return result;
    }
}