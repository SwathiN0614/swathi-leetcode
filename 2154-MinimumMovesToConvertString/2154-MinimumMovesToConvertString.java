// Last updated: 8/13/2026, 3:43:12 PM
class Solution {

    public int minimumMoves(String s) {
        int i = 0;
        int min = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == 'X') {
                min++;
                i += 3;
            } else {

               
                i += 1;
            }
        }

        
        return min;
    }
}