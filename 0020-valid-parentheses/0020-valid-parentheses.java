class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        
        int i=0;
        while (i<s.length()) {
            char c = s.charAt(i);
            
            if (c == '(')
                charStack.push(')');
            if (c == '[')
                charStack.push(']');
            if (c == '{')
                charStack.push('}');
            
            if (c == ')' || c == ']' || c == '}') {
                if (charStack.empty()) {
                    return false;
                }
                
                if (!(charStack.pop() == c)) {
                    return false;
                }
            }
            i++;
        }
        return charStack.empty();
    }
}