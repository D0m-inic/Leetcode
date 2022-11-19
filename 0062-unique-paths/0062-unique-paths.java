class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                
                if (i==0 && j==0) {
                    dp[0][0] = 1;
                    continue;
                }
                
                int leftSquareVal=0;
                int upperSquareVal=0;
                if (!((i-1)<0))
                    leftSquareVal = dp[i-1][j];
                
                if (!((j-1)<0))
                    upperSquareVal = dp[i][j-1];
                
                if (i-1<0)
                    leftSquareVal = 0;
                if (j-1<0)
                    upperSquareVal = 0;
                dp[i][j] = leftSquareVal + upperSquareVal;
            }
        }
        return dp[m-1][n-1];
    }
}