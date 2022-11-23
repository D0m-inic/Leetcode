class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numsUpToN = new HashSet<>();
        for (int i=0; i<=nums.length; i++) {
            numsUpToN.add(i);
        }
        System.out.println(numsUpToN);
        
        for (int i=0; i<nums.length; i++) {
            if (numsUpToN.contains(nums[i])) {
                numsUpToN.remove(nums[i]);
            }
        }
        
        Iterator<Integer> it = numsUpToN.iterator();
        return it.next();
    }
}