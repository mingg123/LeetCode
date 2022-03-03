class Solution {
    public static int cal(char c) {
        int val = 0;
        switch(c) {
            case 'I' :
            val = 1;
            break;
            case 'V' :
            val = 5;
            break;
            case 'X' :
            val = 10;
            break;
            case 'L' :
            val = 50;
            break;
            case 'C' :
            val = 100;
            break;
            case 'D' :
            val = 500;
            break;
            case 'M' :
            val = 1000;
            break;
        }
        return val;
    }
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length()-1; i++) {
            int now = cal(s.charAt(i));
            int next = cal(s.charAt(i+1));
            if(now < next){
                result += - now;
            } else {
                result += now;
            }
        }
        result += cal(s.charAt(s.length()-1));
        System.out.println(result);
        return result;
    }
}