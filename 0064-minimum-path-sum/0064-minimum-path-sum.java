class Solution {
    public int minPathSum(int[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        int[][] dp = new int[m][n];
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                
                if (i==0 && j==0) {
                    dp[0][0] = grid[0][0];
                    continue;
                }
                
                int shortestPathUp = Integer.MAX_VALUE;
                int shortestPathLeft = Integer.MAX_VALUE;
                
                if (j-1 >= 0)
                    shortestPathLeft = dp[i][j-1];
                if (i-1 >=0)
                    shortestPathUp = dp[i-1][j];
                
                dp[i][j] = grid[i][j] + Math.min(shortestPathLeft,shortestPathUp);
            }
        }
        
        return dp[m-1][n-1];
    }
}