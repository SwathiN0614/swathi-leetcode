// Last updated: 8/13/2026, 3:48:40 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        int[][] athletes = new int[n][2];

        for (int i = 0; i < n; i++) {
            athletes[i][0] = score[i]; 
            athletes[i][1] = i;        
        }

        Arrays.sort(athletes, (a, b) -> b[0] - a[0]);

        for (int rank = 0; rank < n; rank++) {
            int idx = athletes[rank][1];

            if (rank == 0) {
                answer[idx] = "Gold Medal";
            } else if (rank == 1) {
                answer[idx] = "Silver Medal";
            } else if (rank == 2) {
                answer[idx] = "Bronze Medal";
            } else {
                answer[idx] = String.valueOf(rank + 1);
            }
        }

        return answer;
    }
}