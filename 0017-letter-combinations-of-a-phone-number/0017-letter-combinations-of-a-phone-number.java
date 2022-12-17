class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> map = new HashMap<>();
        List<String> letters = new ArrayList<>(Arrays.asList("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        for (int i=2; i<10; i++) {
            map.put(i, letters.get(i-2));
        }
        
        return letterCombinationsHelper(digits, map);
    }
    
    public List<String> letterCombinationsHelper(String digits, Map<Integer,String> map) {
        List<String> output_arr = new ArrayList<>();
        if (digits.length() == 0) {
            return output_arr;}
        System.out.println("Digits: " +digits);
        String letters = map.get(digits.charAt(0) - '0');
        
        if (digits.length() == 1) {
            for (int i =0; i<letters.length(); i++) {
                output_arr.add(Character.toString(letters.charAt(i)));
            }
            return output_arr;
        }
        
        for (int i =0; i<letters.length(); i++) {
            List<String> recurs = letterCombinationsHelper(digits.substring(1), map);
            for (String s : recurs) {
                output_arr.add(Character.toString(letters.charAt(i)) + s);
            }
        }
        return output_arr;
    }
}