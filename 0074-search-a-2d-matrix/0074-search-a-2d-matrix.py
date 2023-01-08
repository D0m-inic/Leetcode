class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows, cols = len(matrix), len(matrix[0])
        
        top,bottom = 0, rows-1
        row = 0
        while bottom >= top:
            row = int((bottom + top) / 2)
            
            if (matrix[row][0] > target):
                bottom = row-1
            elif (matrix[row][-1] < target):
                top = row + 1
            else:
                break
        
        left,right = 0, cols-1
        
        while right >= left:
            col = int((left + right) / 2)
            
            if (matrix[row][col] == target):
                return True
            elif (matrix[row][col] < target):
                left = col+1
                continue
            else:
                right = col-1
                continue
        
        return False
        
        