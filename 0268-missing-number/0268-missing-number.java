class Solution {
    public int missingNumber(int[] nums) {
        int sumOfAll = 0;
        int sumOfCur = 0;
        for (int i=0; i<=nums.length; i++) {
            sumOfAll +=i;
        }
        
        for (int i=0; i<nums.length; i++) {
            sumOfCur += nums[i];
        }
        
        return sumOfAll - sumOfCur;
    }
}