class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] num = new int[10000];
        for(int i = 0; i < magazine.length(); i++) {
            num[magazine.charAt(i) - '0']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            num[ransomNote.charAt(i) - '0']--;
        }
  
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 0) return false;
        }
        return true;
    }
}