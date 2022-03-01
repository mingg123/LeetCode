class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        Stack<Integer> s = new Stack<>();
        String num = Integer.toString(x);
        for(int i = 0; i < num.length(); i++) {
            s.add((num.charAt(i)-'0'));
        }
        
        String result = "";
        while(!s.isEmpty()) {
            result+=s.pop();
        }
        return x == Long.parseLong(result) ? true : false;
    }
}