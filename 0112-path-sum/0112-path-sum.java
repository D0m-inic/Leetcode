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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, targetSum, 0);
    }
    
    public boolean hasPathSumHelper(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return (sum+root.val) == targetSum;
        }
        if (root.left == null) {
            return hasPathSumHelper(root.right, targetSum, sum+root.val);
        }
        if (root.right == null) {
            return hasPathSumHelper(root.left, targetSum, sum+root.val);
        }
        return hasPathSumHelper(root.left, targetSum, sum+root.val) || hasPathSumHelper(root.right, targetSum, sum+root.val);
    }
}