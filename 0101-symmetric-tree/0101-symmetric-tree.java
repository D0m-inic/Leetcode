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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricHelper(root.left, root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode rootLeft, TreeNode rootRight) {
        if (rootLeft == null && rootRight == null) {
            return true;
        } else if (rootLeft == null || rootRight == null) {
            return false;
        }
        
        if (!(rootLeft.val == rootRight.val)) {
            return false;
        }
        
        return isSymmetricHelper(rootLeft.left, rootRight.right) && isSymmetricHelper(rootLeft.right, rootRight.left);
    }
}