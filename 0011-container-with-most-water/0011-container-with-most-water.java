import java.lang.Math;

class Solution {
    public int maxArea(int[] height) {
        int L = 0;
        int R = height.length - 1;
        int max = 0;
        while (R > L) {
            int currMax = (R-L) * Math.min(height[R], height[L]);
            if (currMax > max)
                max = currMax;
            if (height[R] < height[L])
                R--;
            else
                L++;
        }
        
        return max;
    }
}