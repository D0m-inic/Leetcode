/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        
        List<Integer> output_arr = new ArrayList<>();
        while (head != null) {
            output_arr.add(head.val);
            head = head.next;
        }
        return listToBST(output_arr);
        
        
        
        
    }
    
    public TreeNode listToBST(List<Integer> output_arr) {
        if (output_arr.isEmpty()) {
            return null;
        }
        
        int middleIndex = output_arr.size()/2;
        int middle = output_arr.get(middleIndex);
        TreeNode head = new TreeNode(middle);
        head.left = listToBST(output_arr.subList(0,middleIndex));
        head.right = listToBST(output_arr.subList(middleIndex+1,output_arr.size()));
        
        return head;
    }
}