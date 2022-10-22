import java.lang.Math;

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        
        while (l != r) {
            int localMax = (r-l) * Math.min(height[l], height[r]);

            if (localMax > max) {
                max = localMax;
            }
            
            if (height[l] < height[r]) {
                l+=1;
            } else {
                r-=1;
            }
        }
        return max;
    }
}