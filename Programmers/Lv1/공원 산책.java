import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = 0, y = 0;
        
        for (int i = 0; i < park.length; i++) {
            int index = park[i].indexOf("S");
            if (index != -1) {
                x = index;
                y = i;
            }
        }
        
        Loop1:
        for (String s : routes) {
            String d = s.split(" ")[0];
            int t = Integer.valueOf(s.split(" ")[1]);
            
            if (d.equals("N")) {
                for (int i = 1; i <= t; i++) {
                    try {
                        if (park[y - i].charAt(x) == 'X') {
                            continue Loop1;
                        }
                    }
                    catch(Exception e) {
                        continue Loop1;
                    }
                }
                
                y -= t;
            }
            else if (d.equals("S")) {
                for (int i = 1; i <= t; i++) {
                    try {
                        if (park[y + i].charAt(x) == 'X') {
                            continue Loop1;
                        }
                    }
                    catch(Exception e) {
                        continue Loop1;
                    }
                }
                
                y += t;
            }
            else if (d.equals("W")) {
                for (int i = 1; i <= t; i++) {
                    try {
                        if (park[y].charAt(x-i) == 'X') {
                            continue Loop1;
                        }
                    }
                    catch(Exception e) {
                        continue Loop1;
                    }
                }
                
                x -= t;
            }
            else { // E
                for (int i = 1; i <= t; i++) {
                    try {
                        if (park[y].charAt(x+i) == 'X') {
                            continue Loop1;
                        }
                    }
                    catch(Exception e) {
                        continue Loop1;
                    }
                }
                
                x += t;
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}