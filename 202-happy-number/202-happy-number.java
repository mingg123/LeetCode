class Solution {
    public boolean isHappy(int n) {
        boolean isflag = false;
        while(Integer.toString(n).length() != 1 || !isflag) {
            if(Integer.toString(n).length() == 1) isflag = true;
            String temp = Integer.toString(n);
            int ans = 0;
            for(int i = 0; i < temp.length(); i++) {
                ans += Math.pow(temp.charAt(i)- '0', 2);
            }
            n = ans;
        }
        System.out.println(n);
        return n == 1 ? true : false;
    }
}