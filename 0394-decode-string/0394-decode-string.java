class Solution {
    public String decodeString(String s) {
        
        System.out.println(s);
        if (s == "") { return "";}
        if (s.length() == 1) { return s; }
        if (Character.isAlphabetic(s.charAt(0))) { return s.substring(0,1) + decodeString(s.substring(1)); }
        
        int seperate = 0;
        while (s.charAt(seperate) != '[') {
            seperate++;
        }
        int n = Integer.parseInt(s.substring(0,seperate));
        int start=seperate+1;    
        int end = 0;   
        Stack<Character> stack = new Stack<>();
        
        for (int i=seperate; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                stack.push(c);
            }
            
            if (c == ']') {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                end = i;
                break;
            }
        }
        System.out.println("HI" + s.substring(end+1));
        String restOfString = decodeString(s.substring(end+1));
        String repeatedString = decodeString(s.substring(start,end));
        String result = "";
        
        for (int i=0; i<n ; i++) {
            result += repeatedString;
        }
        return result + restOfString;
    }
}