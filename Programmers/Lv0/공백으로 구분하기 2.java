import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(item -> !item.equals("")).toArray(String[]::new);
    }
}