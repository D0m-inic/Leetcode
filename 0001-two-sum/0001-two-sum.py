class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i in range(len(nums)):
            secondNum = target - nums[i]
            if secondNum in hashmap:
                return [i,hashmap[secondNum]]
            else:
                hashmap[nums[i]] = i
                
                
        