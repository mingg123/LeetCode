class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < words.length; i++) {
            String target = words[i];
            for(int j = 0; j < target.length(); j++) {
                Character token = target.charAt(j);
                boolean isflag = true;
                for(int k = 0; k < words.length; k++) {
                    if(!words[k].contains(Character.toString(token))) {
                        isflag = true;
                        break;
                    } else {
                        isflag = false;
                    }
                }
                if(!isflag) {
                    arr.add(Character.toString(token));
                    for(int k = i; k < words.length; k++) {
                       words[k] = words[k].replaceFirst(Character.toString(token), "");
                    }
                }
            }
        }
        return arr;
    }
}