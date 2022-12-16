/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode dummyHead;
    dummyHead.next = head;
    
    struct ListNode *prev = &dummyHead;
    struct ListNode *curr = head;
    
    while (curr != NULL && curr->next != NULL) {
        int dup = 0;
        struct ListNode *next = curr->next;
        
        while (curr->next != NULL && curr->val == curr->next->val) {
            curr->next = curr->next->next;
            dup=1;
        }
        if (dup == 1) {
            prev->next = curr->next;
        } else {
            prev = prev->next;
        }
        curr=curr->next;
    }
    
    return dummyHead.next;

}