// Last updated: 8/13/2026, 3:50:11 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int news= 0;
        for(int i = 0;i<nums.length;i++){
            news+=nums[i];
        }
    return sum-news;}
}