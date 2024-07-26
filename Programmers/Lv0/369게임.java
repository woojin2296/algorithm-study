class Solution {
    public int solution(int order) {
        return String.valueOf(order).length() - String.valueOf(order).replaceAll("3", "").replaceAll("6", "").replaceAll("9", "").length();
    }
}