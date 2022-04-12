class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "";
        while(columnNumber > 0) {
            int rem = columnNumber % 26;
            if(rem == 0) {
                s = 'Z' + s;
                columnNumber = columnNumber/ 26 -1;
            }
            else {
                char ch = (char) ('A' + rem -1);
                s = ch + s;
                columnNumber = columnNumber / 26;
            }
        }
        return s;
    }
}