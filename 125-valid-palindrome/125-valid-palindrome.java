class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
               ans += s.charAt(i);
            }
        }
        ans = ans.toLowerCase();
        int index = ans.length() -1;
        for(int i = 0; i < ans.length()/2; i++){
            if(ans.charAt(i) != ans.charAt(index)) {
                return false;
            }else {
                index--;
            }
        }
        return true;
    }
}