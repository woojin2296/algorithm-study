import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, User> users = new HashMap<>();
        
        for (String s : id_list) {
            users.put(s, new User());
        }
        
        for (String s : report) {
            String reporter = s.split(" ")[0];
            String suspect = s.split(" ")[1];
            
            int num = users.get(reporter).report(suspect);
            users.get(suspect).reported(num);
        }
        
        List<String> block = new ArrayList<>();
        for (String s : id_list) {
            if (users.get(s).isBlocked(k)) {
                block.add(s);
            }
        }
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = users.get(id_list[i]).getMailCount(block);
        }
        
        return answer;
    }
}

class User {
    int report = 0;
    int mailCount = 0;
    Map<String, Integer> reports = new HashMap<>();
    
    public int report(String id) {
        if (!reports.containsKey(id)) {
            reports.put(id, 1);
            return 1;
        }
        return 0;       
    }
    
    public void reported(int i) {
        report += i;
    }
    
    public boolean isBlocked(int k) {
        return report >= k ? true : false;
    }
    
    public int getMailCount(List<String> list) {
        for (String s : list) {
            if (reports.containsKey(s)) {
                mailCount++;
            }
        }
        
        return mailCount;
    }
}