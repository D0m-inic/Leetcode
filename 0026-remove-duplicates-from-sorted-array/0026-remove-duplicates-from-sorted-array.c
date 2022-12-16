int removeDuplicates(int* nums, int numsSize){
    int L = 0;
    int R = 0;
    
    while (R < numsSize) {
        while (R+1 < numsSize && nums[R] == nums[R+1]) {
            R++;
        }
        nums[L] = nums[R];
        L++;
        R++;
    }
    
    return L;
}