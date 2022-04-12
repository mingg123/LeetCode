class Solution {
    public int addDigits(int num) {
        String temp = Integer.toString(num);
        while(temp.length() >1) {
            String [] token = temp.split("");
            int ans = 0;
            for(int i = 0; i < token.length; i++) {
                ans += Integer.parseInt(token[i]);
            }
            temp = Integer.toString(ans);
            // System.out.println(ans);
        }
        return Integer.parseInt(temp);
    }
}