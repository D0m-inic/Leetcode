class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output_arr = new ArrayList<>();
        output_arr.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i=0; i<numRows-1; i++) {
            List<Integer> temp = new ArrayList<>(output_arr.get(i));
            temp.add(0, 0);
            temp.add(0);
            
            int slow = 0;
            int fast = 1;
            List<Integer> new_input = new ArrayList<>();
            
            while (fast < temp.size()) {
                new_input.add(temp.get(slow) + temp.get(fast));
                slow++;
                fast++;
            }
            output_arr.add(new_input);
        }
                       
        return output_arr;
    }
}