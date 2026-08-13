// Last updated: 8/13/2026, 3:45:55 PM
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            int idxA = a.indexOf(' ');
            int idxB = b.indexOf(' ');

            String idA = a.substring(0, idxA);
            String idB = b.substring(0, idxB);

            String contentA = a.substring(idxA + 1);
            String contentB = b.substring(idxB + 1);

            boolean digitA = Character.isDigit(contentA.charAt(0));
            boolean digitB = Character.isDigit(contentB.charAt(0));

            
            if (!digitA && !digitB) {
                int cmp = contentA.compareTo(contentB);
                if (cmp != 0) {
                    return cmp;
                }
                return idA.compareTo(idB);
            }

            
            if (!digitA && digitB) {
                return -1;
            }
            if (digitA && !digitB) {
                return 1;
            }

            
            return 0;
        });

        return logs;
    }
}