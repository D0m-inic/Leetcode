class Solution {
    public int reverse(int x) {
        int reversedInt = 0;
        int pop = 0;
        
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            
            if ((reversedInt > Integer.MAX_VALUE/10 || reversedInt == Integer.MAX_VALUE/10 && pop > 7)
                || (reversedInt < Integer.MIN_VALUE/10 || reversedInt == Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }
            
            reversedInt = (reversedInt * 10) + pop;
        }
        
        return reversedInt;
    }
}