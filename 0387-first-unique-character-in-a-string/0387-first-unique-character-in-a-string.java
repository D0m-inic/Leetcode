class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                duplicates.add(s.charAt(i));
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!duplicates.contains(s.charAt(i))) {
                return i;
            }
        }
        return -1;
        
    }
}