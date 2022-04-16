class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int [] temp = new int[128];
        for(int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - '0']++;
        }
        int len = 0;
        for(int i = 0; i < temp.length; i++) {
            len += temp[i]/2 * 2;
        }
        if(len < s.length()) len++;
        return len;
    }
}