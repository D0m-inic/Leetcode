class Solution:
    def isPalindrome(self, s: str) -> bool:
        for c in s:
            if not c.isalnum():
                s = s.replace(c, "",1)
        s = s.lower()
        
        start = 0
        end = len(s) - 1
        
        while end > start:
            if not s[start] == s[end]:
                return False
            start+=1
            end-=1
        
        return True
        
                
                
        