class Solution:
    
    def calcEatingSpeed(self, piles, eatingSpeed):
        sum = 0
        for pile in piles:
            sum += math.ceil(pile/eatingSpeed) 
        return sum
            
    
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = max(piles)
        currentMin = max(piles)
        
        while (r >= l):
            mid = int((l + r) / 2)
            
            if self.calcEatingSpeed(piles, mid) <= h:
                r = mid - 1
                if mid < currentMin:
                    currentMin = mid
            else:
                l = mid + 1
        
        return currentMin