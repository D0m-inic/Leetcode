/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectHelper(root.left, root.right);
        return root;
    }
    
    public void connectHelper (Node leftNode, Node rightNode) {
        if (leftNode == null && rightNode == null) {
            return;
        }
        if (leftNode == null) {
            return;
        }
        if (rightNode == null) {
            return;
        }
        leftNode.next = rightNode;
        connectHelper(leftNode.left, leftNode.right);
        connectHelper(leftNode.right,rightNode.left);
        connectHelper(rightNode.left,rightNode.right);
    }
}