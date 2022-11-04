class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> numbers = new HashSet<>();
        
        while (true) {
            int newNum = sumOfSquares(n);
            
            if (newNum == 1) {
                return true;
            }
            
            if (numbers.contains(newNum)) {
                return false;
            }
            numbers.add(newNum);
            n = newNum;
        }
    }
    
    public Integer sumOfSquares(int n) {
        int sum = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;
            n/=10;
            sum += (lastDigit * lastDigit);
        }
        return sum;
    }
}