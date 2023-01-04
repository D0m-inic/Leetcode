class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefixCount = 1
        postfixCount = 1
        postfix = []
        prefix = []
        for num in nums:
            prefix.append(prefixCount)
            prefixCount*=num
        
        for num in reversed(nums):
            postfix.append(postfixCount)
            postfixCount*=num
            
        postfix.reverse()
        
        output_arr = []
        for i,num in enumerate(prefix):
            output_arr.append(num * postfix[i])
            
        return output_arr
            
            