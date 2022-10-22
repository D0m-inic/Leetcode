class Solution {
        
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutionList = new ArrayList<>();

        Arrays.sort(nums);
        
        for (int i=0; i<nums.length-2; i++) {
            if (i == 0 || i > 0 && (nums[i] != nums[i-1])) {
                int low = i+1;
                int high = nums.length-1;
                int target = 0-nums[i];
                
                while (low < high) {
                    if ((nums[low] + nums[high]) == target) {
                        solutionList.add(Arrays.asList(nums[low], nums[high], nums[i]));
                        while (low < high && (nums[high] == nums[high-1])) {
                            high--;
                        }
                        while (low < high && (nums[low] == nums[low+1])) {
                            low++;
                        }
                        low++;
                        high--;
                    } else if ((nums[low] + nums[high]) > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return solutionList;

    }
}