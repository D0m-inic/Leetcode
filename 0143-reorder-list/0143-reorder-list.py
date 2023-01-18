# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        slow, fast = head, head.next
        
        while (fast and fast.next):
            slow=slow.next
            fast=fast.next.next
            
        afterSlow = slow.next
        slow.next = None
        while afterSlow:
            temp = afterSlow.next
            afterSlow.next = slow
            slow = afterSlow
            afterSlow = temp
        
        while head and slow:
            temp1 = head.next
            temp2 = slow.next
            head.next = slow
            slow.next = temp1
            head = temp1
            slow = temp2
            