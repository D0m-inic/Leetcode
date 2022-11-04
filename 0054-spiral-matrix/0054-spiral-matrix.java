class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> output_arr = new ArrayList<>();
        
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        
        while ((rowEnd >= rowBegin) && (columnEnd >= columnBegin)) {
            
            for (int i=columnBegin; i<=columnEnd; i++) {
                output_arr.add(matrix[rowBegin][i]);
            }

            rowBegin++;

            for (int i=rowBegin; i<=rowEnd; i++) {
                output_arr.add(matrix[i][columnEnd]);
            }

            columnEnd--;
            
            if ((rowEnd >= rowBegin) && (columnEnd >= columnBegin)) {
                for (int i=columnEnd; i>=columnBegin; i--) {
                    output_arr.add(matrix[rowEnd][i]);
                }

                rowEnd--;

                for (int i=rowEnd; i>=rowBegin; i--) {
                    output_arr.add(matrix[i][columnBegin]);
                }
                columnBegin++;   
            }
        }
        
        return output_arr;
    }
}