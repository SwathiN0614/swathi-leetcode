// Last updated: 8/13/2026, 3:47:42 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sum = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        
        dfs(root, 0, sum, count);

        List<Double> ans = new ArrayList<>();
        for (int i = 0; i < sum.size(); i++) {
            ans.add(sum.get(i) / count.get(i));
        }

        return ans;
    }

    public void dfs(TreeNode node, int level, List<Double> sum, List<Integer> count) {
        if (node == null) return;

        if (level == sum.size()) {
            sum.add((double) node.val);
            count.add(1);
        } else {
            sum.set(level, sum.get(level) + node.val);
            count.set(level, count.get(level) + 1);
        }

        dfs(node.left, level + 1, sum, count);
        dfs(node.right, level + 1, sum, count);
    }
}