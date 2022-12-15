/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode *cursor = head;
    while (cursor != NULL && cursor->next != NULL) {
        while (cursor->next != NULL && cursor->val == cursor->next->val) {
            cursor->next = cursor->next->next;
        }
        cursor = cursor->next;
    }
    return head;
}