class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashset = defaultdict(list)
        
        for str in strs:
            id_arr = [0] * 26
            for c in str:
                id_arr[ord(c) - ord('a')]+=1
            hashset[tuple(id_arr)].append(str)
        
        return hashset.values()
            
        