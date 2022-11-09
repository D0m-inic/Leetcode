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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode oddCursor = oddHead;
        ListNode evenCursor = evenHead;
        
        while (fast != null && fast.next != null) {
            slow = slow.next.next;
            fast = fast.next.next;
            oddCursor.next = slow;
            evenCursor.next = fast;
            oddCursor = slow;
            evenCursor = fast;
        }
        
        oddCursor.next = evenHead;
        
        return oddHead;
    }
}