class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word1.length(); i++) {
            if(map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), map.get(word1.charAt(i))+1);
            } else {
                map.put(word1.charAt(i), 1);
            }
        }
        for(int i = 0; i < word2.length(); i++) {
            if(map.containsKey(word2.charAt(i))) {
                map.put(word2.charAt(i), map.get(word2.charAt(i))-1);
            }
        }
        boolean isflag = false;
        int count = 0;
        for(Character t : map.keySet()) {
            if(Math.abs(map.get(t)) > 3) {
                return false;
            }
            count+= map.get(t);
        }
        
        
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < word2.length(); i++) {
            if(map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i))+1);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        for(int i = 0; i < word1.length(); i++) {
            if(map2.containsKey(word1.charAt(i))) {
                map2.put(word1.charAt(i), map2.get(word1.charAt(i))-1);
            }
        }
        isflag = false;
        int count2 = 0;
        for(Character t : map2.keySet()) {
            if(Math.abs(map2.get(t)) > 3) {
                return false;
            }
            count2+= map2.get(t);
        }
        
        if(count == word1.length()) return true;
        return true;
    }
}