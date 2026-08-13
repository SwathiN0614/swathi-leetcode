// Last updated: 8/13/2026, 3:48:57 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0, count = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else if (g[i] > s[j]) {
                j++;
            } else {
                i++;
            }
        }

        return count;
    }
}