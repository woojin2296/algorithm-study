class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int h = health;
        int time = 0;

        for (int[] a: attacks) {
            if (h <= 0) {
                return -1;
            }

            int plusH = a[0] - time - 1;
            int bonusH = plusH / bandage[0];

            time = a[0];
            h = h + (plusH * bandage[1]);
            h = h + (bonusH * bandage[2]);
            
            if (h > health) h = health;

            h -= a[1];
        }        

        return h <= 0 ? -1 : h;
    }
}