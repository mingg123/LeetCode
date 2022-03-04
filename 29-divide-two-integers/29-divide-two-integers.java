class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }
        int ans = (dividend)/(divisor);
        if(dividend < 0 && divisor < 0) {
            return Math.abs(ans);
        } else 
        return ans;
    }
}