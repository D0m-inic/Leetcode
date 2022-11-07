class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int output_arr[] = new int[n];
        Arrays.fill(output_arr, -1);
        
        for (int i=0; i<n; i++) {
            
            int currentRow = 0;
            int currentCol = i;
            
            while (true) {
                if (currentRow >= m) {
                    if (currentCol >= 0 && currentCol < n) {
                        output_arr[i] = currentCol;   
                    }
                    break;
                }
                
                if (currentCol+1 < n && grid[currentRow][currentCol] == 1 && grid[currentRow][currentCol+1] == 1) {
                    currentRow++;
                    currentCol++;
                } else if (currentCol - 1 >= 0 && grid[currentRow][currentCol] == -1 && grid[currentRow][currentCol-1] == -1) {
                    currentRow++;
                    currentCol--;
                } else {
                    break;
                }
            }
        }
        return output_arr;
    }
}