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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode slowPointer = dummyHead;
        ListNode fastPointer = dummyHead;
        
        for (int i=0; i<n; i++) {
            fastPointer = fastPointer.next;
        }
        
        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        
        slowPointer.next = slowPointer.next.next;
        
        return dummyHead.next;
    }
}