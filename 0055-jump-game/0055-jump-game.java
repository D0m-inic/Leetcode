class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        
        for (int i=nums.length-2; i>=0; i--) {
            boolean result = false;
            for (int j=0; j<nums[i]; j++) {
                if ((i+j+1) > nums.length-1) {
                    continue;
                }
                result = result || dp[i+j+1];
            }
            dp[i] = result;
        }
        
        return dp[0];
    }
}