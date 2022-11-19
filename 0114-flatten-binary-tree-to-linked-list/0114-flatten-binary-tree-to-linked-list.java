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
    List<TreeNode> treenodes = new ArrayList<>();
    public void flatten(TreeNode root) {
        
        flattenHelper(root);
        
        for (int i=0; i<treenodes.size() -1; i++) {
            treenodes.get(i).left = null;
            treenodes.get(i).right = treenodes.get(i+1);
        }
    }
    
    public void flattenHelper(TreeNode root) {
        if (root == null)
            return;   
        
        treenodes.add(root);
        flattenHelper(root.left);
        flattenHelper(root.right);
    }
}