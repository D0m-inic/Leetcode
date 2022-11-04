class Solution {
    public String reverseVowels(String s) {
        int begin = 0;
        int end = s.length()-1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder sb = new StringBuilder(s);
        
        while (end > begin) {
            if (vowels.contains(s.charAt(begin)) && vowels.contains(s.charAt(end))) {
                Character temp = s.charAt(begin);
                sb.setCharAt(begin,s.charAt(end));
                sb.setCharAt(end, temp);
                begin++;
                end--;
            }
            
            if (!vowels.contains(s.charAt(begin))) {
                begin++;
            }
            
            if (!vowels.contains(s.charAt(end))) {
                end--;
            }
        }
        
        return sb.toString();
    }
}