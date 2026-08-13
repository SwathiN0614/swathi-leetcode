// Last updated: 8/13/2026, 3:45:40 PM
import java.util.*;

class Solution {

    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {

        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diags = new HashMap<>();
        Map<Integer, Integer> antiDiags = new HashMap<>();

        Set<Long> active = new HashSet<>();

    
        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = (((long) r) << 32) | (c & 0xffffffffL);

            if (!active.add(key)) continue;

            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diags.put(r - c, diags.getOrDefault(r - c, 0) + 1);
            antiDiags.put(r + c, antiDiags.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] dirs = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},  {0,0},  {0,1},
            {1,-1},  {1,0},  {1,1}
        };

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            if (rows.containsKey(r)
                    || cols.containsKey(c)
                    || diags.containsKey(r - c)
                    || antiDiags.containsKey(r + c)) {
                ans[i] = 1;
            }

            
            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;

                long key =
                    (((long) nr) << 32) | (nc & 0xffffffffL);

                if (!active.remove(key))
                    continue;

                decrement(rows, nr);
                decrement(cols, nc);
                decrement(diags, nr - nc);
                decrement(antiDiags, nr + nc);
            }
        }

        return ans;
    }

    private void decrement(Map<Integer, Integer> map, int key) {
        int cnt = map.get(key);

        if (cnt == 1)
            map.remove(key);
        else
            map.put(key, cnt - 1);
    }
}