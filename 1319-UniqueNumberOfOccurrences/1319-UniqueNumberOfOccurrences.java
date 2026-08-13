// Last updated: 8/13/2026, 3:44:43 PM


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();


        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

    
        Set<Integer> occurrences = new HashSet<>();

        for (int count : freq.values()) {
            if (!occurrences.add(count)) {
                return false; 
            }
        }

        return true;
    }
}  
    
