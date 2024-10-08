class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum%2 != 0) {
                        if (isPrime(sum)) {
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }
    
    public Boolean isPrime(int n) {
        for (int i = n-1; i > 1; i--) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}