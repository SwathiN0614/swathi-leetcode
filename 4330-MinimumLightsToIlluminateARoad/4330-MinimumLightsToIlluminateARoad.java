// Last updated: 8/13/2026, 3:42:06 PM
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;

        int[] ravelunico = lights.clone();

        
        int[] diff = new int[n + 1];

        
        for (int i = 0; i < n; i++) {
            int v = ravelunico[i];
            if (v > 0) {
                int left = Math.max(0, i - v);
                int right = Math.min(n - 1, i + v);
                diff[left] += 1;
                if (right + 1 < n) diff[right + 1] -= 1;
            }
        }


        boolean[] illuminated = new boolean[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            illuminated[i] = (curr > 0);
        }


        int count = 0;
        int i = 0;
        while (i < n) {
            if (illuminated[i]) {
                i++;
                continue;
            }
            int pos = Math.min(n - 1, i + 1);
            int left = Math.max(0, pos - 1);
            int right = Math.min(n - 1, pos + 1);
            for (int j = left; j <= right; j++) {
                illuminated[j] = true;
            }

            count++;
            i = right + 1;
        }

        return count;
    }
}