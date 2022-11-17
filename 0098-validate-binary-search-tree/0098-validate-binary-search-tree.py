# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isValidBST(self, root):
        def isValidBSTHelper(root, lowerBound, upperBound):
            if not root:
                return True

            if not (lowerBound < root.val and root.val < upperBound):
                return False

            return isValidBSTHelper(root.left,lowerBound, root.val) and isValidBSTHelper(root.right,root.val, upperBound)

        return isValidBSTHelper(root, float("-inf"), float("inf"))