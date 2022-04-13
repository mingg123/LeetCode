class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n>1) {
            if(n%3 ==0)
            n = n/3;
            else break;
        }
        // System.out.println(n);
        return n == 1 ? true : false;
    }
}