class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l = 0
        r = 0
        hashset = {}
        maxLen = 0
        
        while(r < len(s)):
            hashset[s[r]] = 1 + hashset.get(s[r], 0)
            
            if (r-l+1 - hashset[max(hashset, key=hashset.get)] > k):
                hashset[s[l]]-=1
                l+=1
            maxLen = max(maxLen, r - l + 1)
            r+=1
        return maxLen
                
            
            