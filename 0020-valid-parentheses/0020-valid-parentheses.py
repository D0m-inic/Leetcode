class Solution:
    def isValid(self, s: str) -> bool:
        openBracket = ('(', '{', '[')
        stack = []
        
        for c in s:
            if c in openBracket:
                if c == '(':
                    stack.append(')')
                if c == '{':
                    stack.append('}')
                if c == '[':
                    stack.append(']')
            else:
                
                if not stack or c != stack.pop():
                    return False
        
        return not stack
                
        