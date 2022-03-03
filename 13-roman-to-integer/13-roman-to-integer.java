class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        map.put("I",  1);
        map.put("IV",  4);
        map.put("V",  5);
        map.put("IX",  9);
        map.put("X",  10);
        map.put("XL",  40);
        map.put("L",  50);
        map.put("XC",  90);
        map.put("C",  100);
        map.put("CD",  400);
        map.put("D",  500);
        map.put("CM",  900);
        map.put("M",  1000);
        
        while(s.length() >= 1) {
            String copys = s;
            String temp = "";
            if(copys.length() > 1)
            temp = copys.substring(0,2);
            String token = copys.substring(0, 1);
            if(map.containsKey(temp)) {
                result += map.get(temp);
                s = s.replaceFirst(temp, "");
            } else {
                result += map.get(token);
                s = s.replaceFirst(token, "");
            }
        }
        // System.out.println(result);
        return result;
    }
}