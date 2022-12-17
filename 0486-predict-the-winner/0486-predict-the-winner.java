class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        return PredictTheWinnerHelper(nums,start,end,true) >= PredictTheWinnerHelper(nums,start,end,false);
    }
    
    public int PredictTheWinnerHelper(int[] nums, int start, int end, boolean turn) {
        if (start > end) {
            return 0;
        }
        
        if (turn) {
            return Math.max ((nums[start] + PredictTheWinnerHelper(nums,start+1,end,false)), (nums[end] + PredictTheWinnerHelper(nums,start,end-1,false)));
        } else {
            return Math.min ((PredictTheWinnerHelper(nums,start+1,end,true)), (PredictTheWinnerHelper(nums,start,end-1,true)));
        }
        
    }
}