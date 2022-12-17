class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList<>();
        backtrack(output_arr,0,0,n,"");
        return output_arr;
    }
    
    public void backtrack (List<String> output_arr, int numOpen, int numClosed, int n, String currStr) {
        if (numOpen == n && numClosed == n) {
            output_arr.add(currStr);
            return;
        }
        
        if (numOpen < n) {
            backtrack(output_arr, numOpen+1, numClosed, n, currStr + "(");
        }
        if (numClosed < numOpen) {
            backtrack(output_arr, numOpen, numClosed+1, n, currStr + ")");        
        }
    }
}