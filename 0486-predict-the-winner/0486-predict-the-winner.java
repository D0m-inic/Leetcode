class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int p2 = 0;
        for (int i=0; i<=end; i++) {
            p2 += nums[i];
        }
        int p1 = PredictTheWinnerHelper(nums,start,end,true);
        p2 -= p1;
        
        return p1 >= p2;
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