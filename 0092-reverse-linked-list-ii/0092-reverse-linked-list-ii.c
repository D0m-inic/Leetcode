/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right){
    if (left == right) {
        return head;
    }
    struct ListNode dummyHead;
    dummyHead.next = head;
    
    struct ListNode *prev = &dummyHead;
    struct ListNode *curr = head;
    
    for (int i=1; i<left; i++) {
        prev = prev->next;
        curr = curr->next;
    }
    struct ListNode *last_before_left = prev;
    struct ListNode *leftNode = curr;
    prev = prev->next;
    curr = curr->next;
    
    for (int i=0; i< (right-left) ; i++) {
        struct ListNode *next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    
    struct ListNode *rightNode = prev;
    last_before_left->next = rightNode;
    leftNode->next = curr;
    
    return dummyHead.next;

}