class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        charFreqS, charFreqT = {}, {}
        
        for i in range(len(s)):
            charFreqS[s[i]] = 1 + charFreqS.get(s[i],0)
            charFreqT[t[i]] = 1 + charFreqT.get(t[i],0)
        return charFreqS == charFreqT
            
        