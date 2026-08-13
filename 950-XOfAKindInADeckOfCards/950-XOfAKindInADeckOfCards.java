// Last updated: 8/13/2026, 3:46:10 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;

        for (int count : freq.values()) {
            gcd = gcd(gcd, count);
        }

        return gcd > 1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}