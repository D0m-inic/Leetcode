class Solution:
    def isPalindrome(self, s: str) -> bool:
        start = 0
        end = len(s) - 1
        
        while end > start:
            
            while end > start and not self.alphaNum(s[start]):
                start+=1
            
            while end > start and not self.alphaNum(s[end]):
                end-=1
            
            if not s[start].lower() == s[end].lower():
                return False
            start+=1
            end-=1
            
        return True
    
    def alphaNum(self, c):
        return (ord('a') <= ord(c) <= ord('z') 
                or ord('A') <= ord(c) <= ord('Z')
                or ord('0') <= ord(c) <= ord('9'))
        
                
                
        