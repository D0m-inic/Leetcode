class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        
        while (r > l) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r -=1;
            } else if (sum < target) {
                l+=1;
            } else {
                int[] ans = {l+1,r+1};
                return ans;
            }
        }
        return null;
    }
}