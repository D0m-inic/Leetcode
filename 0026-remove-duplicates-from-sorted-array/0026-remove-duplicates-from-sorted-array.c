int removeDuplicates(int* nums, int numsSize){
    int correct_pos = 0;
    int start = 0;
    int end = 0;
    int k = 0;
    
    while (end < numsSize) {
        while (end < numsSize && nums[start] == nums[end]) {
            end++;
        }
        nums[correct_pos] = nums[start];
        correct_pos++;
        start = end;
        k++;
    }
    
    return k;
}