import java.util.*;

class Solution {
    public String solution(String number, int k) {        
        StringBuilder result = new StringBuilder();

        while(k > 0) {
            if (number.length() == k) {
                number = "";
                break;
            }
            String[] temp = number.substring(0, k+1).split("");
            Arrays.sort(temp, Collections.reverseOrder());
            int index = number.indexOf(temp[0]);
            number = number.substring(index + 1);
            result.append(temp[0]);
            k -= index;
        }
        result.append(number);
        return result.toString();
    }
}