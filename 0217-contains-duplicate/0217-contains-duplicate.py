class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        nums.sort()
        prevNum = 0
        firstVal = True
        for n in nums:
            if firstVal:
                prevNum = n
                firstVal = False
                continue
            if prevNum == n:
                return True
            prevNum = n
        return False
            
        