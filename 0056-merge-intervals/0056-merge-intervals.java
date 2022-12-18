class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int []> output_arr = new ArrayList<>();
        output_arr.add(intervals[0]);
        
        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0] <= output_arr.get(output_arr.size()-1)[1]) {
                int newValue = Math.max(intervals[i][1], output_arr.get(output_arr.size()-1)[1]);
                output_arr.get(output_arr.size()-1)[1] = newValue;
            } else {
                output_arr.add(intervals[i]);
            }
        }
        
        
        return output_arr.toArray(new int[0][]);
    }
}