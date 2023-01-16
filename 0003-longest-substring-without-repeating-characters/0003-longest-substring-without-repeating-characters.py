class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        r = 0
        maxLen = 0
        hashset = set()
        while (r < len(s)):
            while(s[r] in hashset):
                hashset.remove(s[l])
                l+=1
            hashset.add(s[r])
            maxLen = max(maxLen, r - l+1)
            r+=1
        return maxLen
        