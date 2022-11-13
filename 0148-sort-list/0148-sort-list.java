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
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode temp= head;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;
        
        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slow);
        
        return merge(leftSide, rightSide);
    }
    
    public ListNode merge (ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode();
        ListNode cursor = new ListNode();
        dummyHead.next = cursor;
        
        while (left != null && right != null) {
            if (left.val > right.val) {
                cursor.next = right;
                right = right.next;
            } else {
                cursor.next = left;
                left = left.next;
            }
            
            cursor = cursor.next;
        }
        
        if (left != null) {
            cursor.next = left;
        }
        
        if (right != null) {
            cursor.next = right;
        }
        
        return dummyHead.next.next;
    }
}