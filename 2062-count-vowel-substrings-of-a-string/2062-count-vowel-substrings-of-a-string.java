import java.util.*;
class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> vo = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> window = new HashSet<>();
        for(int i = 0; i < word.length(); i++) {
            window.clear();
            if(vo.contains(word.charAt(i))) {
                window.add(word.charAt(i));
                for(int j = i+1; j< word.length(); j++) {
                    if(!vo.contains(word.charAt(j))) {
                        break;
                    } else {
                        window.add(word.charAt(j));
                        if(window.size() == 5) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}