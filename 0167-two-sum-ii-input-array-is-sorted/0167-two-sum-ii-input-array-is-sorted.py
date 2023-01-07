class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        r = len(numbers) - 1
        
        while r > l:
            if (target == numbers[l] + numbers[r]):
                return [l+1,r+1]
            
            if (target > numbers[l] + numbers[r]):
                l+=1
            else:
                r-=1
        