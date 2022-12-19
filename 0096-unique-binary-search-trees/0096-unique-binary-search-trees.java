class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i=1; i<=n; i++) {
            if (i == 1) { continue;}
            for (int j=i-1; j>=0; j--) {
                dp[i]+=(dp[j]*dp[i-j-1]);
            }
        }
        
        return dp[n];
    }
}