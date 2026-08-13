// Last updated: 8/13/2026, 3:43:56 PM
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        for( int i=1; i < s.length(); i++ ){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i-1);
            if( ch == ch2 ){
                count++;
                max = Math.max( max , count);
            }else{
                count = 1;
            }

        }
        return max;
    }
}