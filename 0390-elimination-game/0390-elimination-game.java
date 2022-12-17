class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        return lastRemainingHelper(n, head,true,1);
    }
    
    public int lastRemainingHelper (int n, int head, boolean left, int step) {
        if (n == 1) { return head; }
        if (left || n % 2 == 1) { head +=step; }
        return lastRemainingHelper(n/2,head,!left, step*2);
    }
}