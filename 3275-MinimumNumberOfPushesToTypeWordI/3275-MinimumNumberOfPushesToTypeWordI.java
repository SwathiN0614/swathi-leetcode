// Last updated: 8/13/2026, 3:42:21 PM
class Solution {
    public int minimumPushes(String word) {
        int increment = 1;
        int answer = 0;
        int length = word.length();
        while (length > 0) {
            int diff = Math.min(length, 8);
            answer += diff * increment;
            length -= diff;
            increment++;
        }
        return answer;
    }
}