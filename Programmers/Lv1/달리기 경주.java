import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            playerIndexMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int index = playerIndexMap.get(calling);
            // 선수들의 위치를 바꿉니다.
            String temp = players[index - 1];
            players[index - 1] = calling;
            players[index] = temp;
            // 선수들의 새로운 인덱스를 업데이트합니다.
            playerIndexMap.put(calling, index - 1);
            playerIndexMap.put(temp, index);
        }

        return players;
    }
}