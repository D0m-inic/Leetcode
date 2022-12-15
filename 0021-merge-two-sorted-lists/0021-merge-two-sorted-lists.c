/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode dummyHead;
    struct ListNode *cursor = &dummyHead;
    cursor->next = NULL;
    while (list1 != NULL && list2 != NULL) {
        if (list1->val > list2->val) {
            cursor->next = list2;
            list2 = list2->next;
        } else {
            cursor->next = list1;
            list1 = list1->next;
        }
        cursor = cursor->next;
    }
    
    if (list1 != NULL) {
        cursor->next = list1;
    }
    if (list2 != NULL) {
        cursor->next = list2;
    }
    
    return dummyHead.next;
}