class Solution {
    public String longestCommonPrefix(String[] strs) {
        int endIndex = strs[0].length();
        String commonPrefix = strs[0];
        
        for (int i=1; i<strs.length; i++) {
            if (strs[i].length() <= endIndex) {
                endIndex = (strs[i].length() == 0) ? 0 : strs[i].length() ;
            }
            while (!commonPrefix.substring(0,endIndex).equals(strs[i].substring(0,endIndex))) {
                endIndex--;
            }
        }
        
        return commonPrefix.substring(0,endIndex);
        
    }
}