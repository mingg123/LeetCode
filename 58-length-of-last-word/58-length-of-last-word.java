class Solution {
    public int lengthOfLastWord(String s) {
        if(!s.contains(" ")) return s.length();
        String [] token = s.split(" ");
        for(int i = token.length-1; i>=0; i--) {
            if(!token[i].equals(" ")) {
                return token[i].length();
            }
        }
        return token[token.length-1].length();
    }
}