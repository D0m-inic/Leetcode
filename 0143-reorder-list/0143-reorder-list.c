/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head){
    if (head == NULL)
        return;
    if (head->next == NULL)
        return;
    if (head->next->next == NULL)
        return;
    
    struct ListNode *slow = head;
    struct ListNode *fast = head;
    
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    
    struct ListNode *start_of_second_list = slow->next;
    slow->next = NULL;
    slow = start_of_second_list;
    struct ListNode *medium = slow->next;
    
    while (medium != NULL) {
        struct ListNode *next = medium->next;
        medium->next = slow;
        slow = medium;
        medium = next;
    }
    
    start_of_second_list->next = NULL;
    //head will be head of forwards list
    //slow will be head of backwards list
    while (head != NULL && slow != NULL) {
        struct ListNode *forwardNext = head->next;
        struct ListNode *backwardNext = slow->next;
        head->next = slow;
        slow->next = forwardNext;
        head = forwardNext;
        slow = backwardNext;
    }
}