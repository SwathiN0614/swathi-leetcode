// Last updated: 8/13/2026, 3:42:47 PM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        int len = words.length;
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String w = words[i];

            char ch1 = w.charAt(0);
            char ch2 = w.charAt(1);

            int start = i + 1;
            int end = len - 1;

            while (start <= end) {

                String s1 = words[start];
                String s2 = words[end];

                if (s1.charAt(0) == ch2 && s1.charAt(1) == ch1) {
                    count++;
                }

                if (start != end 
                    && s2.charAt(0) == ch2 
                    && s2.charAt(1) == ch1) {

                    count++;
                }

                start++;
                end--;
            }

        }

        return count;
    }
}