class Solution {
  public boolean detectCapitalUse(String word) {
      int count = 0;
      if(Character.isUpperCase(word.charAt(0))) {
          for(int i = 1; i < word.length(); i++) {
              if(!Character.isUpperCase(word.charAt(i))) {
                  if(count == 2) return false;
                  if(i == word.length() -1 && count == 2) return false;
                  count = 1;
              } else {
                  if(count == 1 && Character.isUpperCase(word.charAt(i))) {
                      return false;
                  }
                  count = 2;
              }
          }
      }
      else {
          for(int i = 0; i < word.length(); i++) {
              if(!Character.isLowerCase(word.charAt(i))) {
                  return false;
              }
          }
      }
      return true;
  }
}