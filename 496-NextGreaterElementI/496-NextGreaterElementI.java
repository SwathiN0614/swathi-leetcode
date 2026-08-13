// Last updated: 8/13/2026, 3:48:42 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]nextGreater=new int[100010];
        Stack <Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty()&& stack.peek()<=nums2[i]){
                stack.pop();
            }
            nextGreater[nums2[i]]=stack.isEmpty()?-1:
            stack.peek();
            stack.push(nums2[i]);
        }
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
             ans[i]=nextGreater[nums1[i]];
        }
        return ans;
    }
}
       