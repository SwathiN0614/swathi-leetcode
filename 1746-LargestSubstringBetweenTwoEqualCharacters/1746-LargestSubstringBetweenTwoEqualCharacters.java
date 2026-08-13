// Last updated: 8/13/2026, 3:43:36 PM
import java.util.*;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] a = new int[26];
        Arrays.fill(a, -1);
        int b = -1;

        for (int c = 0; c < s.length(); c++) {
            int d = s.charAt(c) - 'a';

            if (a[d] == -1) {
                a[d] = c;
            } else {
                b = Math.max(b, c - a[d] - 1);
            }
        }

        return b;
    }
}