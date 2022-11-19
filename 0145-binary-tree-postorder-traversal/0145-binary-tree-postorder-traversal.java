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
    List<Integer> output_arr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        preorderTraversalHelper(root);
        return output_arr;
    }
    
    public void preorderTraversalHelper(TreeNode root) {
        if (root == null)
            return;
        
        preorderTraversalHelper(root.left);
        preorderTraversalHelper(root.right);
        output_arr.add(root.val);
    }
}