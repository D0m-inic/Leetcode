class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        List<List<String>> output_arr = new ArrayList<>();
        
        for (int i=0; i<strs.length; i++) {
            String str = strs[i];
            Integer[] stringKeyArray = new Integer[26];
            Arrays.fill(stringKeyArray,0);
            List<Integer> stringKey = Arrays.asList(stringKeyArray);
            
            for (int j=0 ; j<str.length(); j++) {
                char c = str.charAt(j);
                stringKey.set(c-'a', stringKey.get(c-'a') + 1);
            }
            
            if (map.containsKey(stringKey)) {
                List<String> newValue = map.get(stringKey);
                newValue.add(str);
                map.put(stringKey, newValue);
            } else {
                map.put(stringKey, new ArrayList<>(Arrays.asList(str)));
            }
        }
        
        for (List<String> list : map.values()) {
            output_arr.add(list);
        }
        
        return output_arr;
    }
}