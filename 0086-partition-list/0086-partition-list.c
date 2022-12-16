/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x){
    struct ListNode lessThanHead;
    lessThanHead.next = NULL;
    struct ListNode *lessThanCursor = &lessThanHead;
    struct ListNode greaterThanHead;
    struct ListNode *greaterThanCursor = &greaterThanHead;
    greaterThanHead.next = NULL;
    
    while (head != NULL) {
        if (head->val < x) {
            lessThanCursor->next = head;
            lessThanCursor = lessThanCursor->next;
        } else {
            greaterThanCursor->next = head;
            greaterThanCursor = greaterThanCursor->next;
        }
        head = head->next;
    }
    
    lessThanCursor->next = greaterThanHead.next;
    greaterThanCursor->next = NULL;
    return lessThanHead.next;
}