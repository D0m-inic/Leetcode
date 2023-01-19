# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        res = 0
        
        def height(root: Optional[TreeNode]) -> int:
            nonlocal res

            if not root:
                return 0

            leftHeight = height(root.left)
            rightHeight = height(root.right)
            res = max(res,leftHeight+rightHeight)
            return 1 + max(leftHeight, rightHeight)
        
        height(root)
        return res
        