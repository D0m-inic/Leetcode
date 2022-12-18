class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) { return nums[0];}
        int[] nums1 = nums.clone();
        nums1[0] = 0;
        nums[nums.length-1] = 0;
        return Math.max(robHelper(nums1), robHelper(nums));
    }
    
    public int robHelper (int[] nums) {
        int rob1=0;
        int rob2=0;
        
        for (int i=0; i<nums.length; i++) {
            int tmp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = tmp;
        }
        return rob2;
    }
}