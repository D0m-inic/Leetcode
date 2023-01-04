class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        r = len(numbers) - 1
        
        while r > l:
            if (target == numbers[l] + numbers[r]):
                ans = []
                ans.append(l+1)
                ans.append(r+1)
                return ans
            
            if (target > numbers[l] + numbers[r]):
                l+=1
            else:
                r-=1
        