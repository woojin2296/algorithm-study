import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lost_list = new ArrayList<>();
        List<Integer> reserve_list = new ArrayList<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i : reserve) {
            reserve_list.add(i);
        }
        
        for (int i : lost) {
            if (reserve_list.contains(i)) {
                reserve_list.remove(Integer.valueOf(i));
            }
            else {
                lost_list.add(i);
            }
        }
        
        for (int k : lost_list) {
            System.out.print(k + ", ");
        }
        System.out.println();
        
        for (int k : reserve_list) {
            System.out.print(k + ", ");
        }
        System.out.println();
        
        int answer = n;
        for (int i : lost_list) {
            if (reserve_list.contains(i-1)) {
                reserve_list.remove(Integer.valueOf(i-1));
            } 
            else if (reserve_list.contains(i+1)) {
                reserve_list.remove(Integer.valueOf(i+1));
            }
            else {
                answer--;
            }
        }
        
        return answer;
    }
}