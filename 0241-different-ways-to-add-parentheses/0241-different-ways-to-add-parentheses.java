class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> output_arr = new ArrayList<>();
        
        for (int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                String left = expression.substring(0,i);
                String right = expression.substring(i+1);
                List<Integer> leftEvaluations = diffWaysToCompute(left);
                List<Integer> rightEvaluations = diffWaysToCompute(right);
                
                for (Integer leftEvaluation : leftEvaluations) {
                    for (Integer rightEvaluation : rightEvaluations) {
                        if (c == '-') { output_arr.add(leftEvaluation - rightEvaluation);}
                        if (c == '+') { output_arr.add(leftEvaluation + rightEvaluation);}
                        if (c == '*') { output_arr.add(leftEvaluation * rightEvaluation);}
                    }
                }
            }
        }
        
        if (output_arr.isEmpty()) {
            output_arr.add(Integer.parseInt(expression));
        }
        
        return output_arr;
    }
}