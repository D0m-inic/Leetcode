class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashset = {}
        for num in nums:
            hashset[num] = hashset.get(num,0) + 1
        
        list = [(k,v) for k,v in hashset.items()]
        list.sort(key=lambda x: x[1], reverse = True)
        
        output_arr = []
        for i in range(k):
            output_arr.append(list[i][0])
            
        return output_arr
            
        