# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        treeIsBalanced = True
        
        def isBalancedHelper(root):
            nonlocal treeIsBalanced
            
            if not root:
                return 0
            
            left = isBalancedHelper(root.left)
            right = isBalancedHelper(root.right)
            treeIsBalanced = treeIsBalanced and (abs(right - left) <=1)
            
            return 1 + max(left,right)
        
        isBalancedHelper(root)
        return treeIsBalanced
            
            
        