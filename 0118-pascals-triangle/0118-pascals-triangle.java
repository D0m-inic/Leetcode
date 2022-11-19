class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<>();
        pTriangle.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i=0; i<numRows-1; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            
            int slow = 0;
            int fast = 1;
            
            while (fast < pTriangle.get(i).size()) {
                newRow.add(pTriangle.get(i).get(slow) + pTriangle.get(i).get(fast));
                slow++;
                fast++;
            }
            newRow.add(1);
            pTriangle.add(newRow);
        }
        return pTriangle;
    }
}