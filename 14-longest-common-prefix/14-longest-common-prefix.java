import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
         String ans = "";
        String temp = strs[0];
        int minLen = Integer.MAX_VALUE;
        for(int i =0; i < strs.length; i++) {
            minLen = Math.min(strs[i].length(), minLen);
        }
        for(int i = minLen; i >=0; i--) {
            String token = temp.substring(0,i);
            boolean isflag = false;
            for(int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(token)) {
                    isflag = true;
                }
            }
            if(!isflag) {
                ans = token;
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}