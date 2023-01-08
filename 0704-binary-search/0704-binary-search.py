class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) - 1
        
        while r >= l:
            mid = int((r+l) /2)
            print(mid)
            print (target)
            
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                r = mid-1
                continue
            else:
                l = mid+1
                continue
        
        return -1
                
        