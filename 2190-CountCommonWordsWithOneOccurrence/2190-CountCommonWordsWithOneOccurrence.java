// Last updated: 8/13/2026, 3:43:06 PM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            if (map.containsKey(s) && map.get(s) <= 1) {
                map.put(s, map.getOrDefault(s, 0) - 1);
            }
        }

        for (int v : map.values()) {
            if (v == 0) {
                count++;
            }
        }

        return count;
    }
}