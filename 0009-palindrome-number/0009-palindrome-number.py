class Solution:
    def isPalindrome(self, x: int) -> bool:
        xStr = str(x)
        while len(xStr) > 1:
            if xStr[0] != xStr[-1]:
                return False
            xStr = xStr[1:-1]
        return True