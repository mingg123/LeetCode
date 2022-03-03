import java.util.*;
class Solution {
    public String intToRoman(int num) {
        int result = num;
        StringBuilder sb = new StringBuilder();
        while(result >= 1) {
            if(result >= 1000) {
                int temp = result / 1000;
                for(int i = 0; i < temp; i++) {
                    sb.append("M");
                }
                result = result % 1000;
            } else if(result >= 900) {
                int temp = result / 900;
                for(int i = 0; i < temp; i++) {
                    sb.append("CM");
                }
                result = result % 900;
            }  else if(result >= 500) {
                int temp = result / 500;
                for(int i = 0; i < temp; i++) {
                    sb.append("D");
                }
                result = result % 500;
            }   else if(result >= 400) {
                int temp = result / 400;
                for(int i = 0; i < temp; i++) {
                    sb.append("CD");
                }
                result = result % 400;
            }
            else if(result >= 100) {
                int temp = result / 100;
                for(int i = 0; i < temp; i++) {
                    sb.append("C");
                }
                result = result % 100;
            } else if(result >= 90) {
                int temp = result / 90;
                for(int i = 0; i < temp; i++) {
                    sb.append("XC");
                }
                result = result % 90;
            }else if(result >= 50) {
                int temp = result / 50;
                for(int i = 0; i < temp; i++) {
                    sb.append("L");
                }
                result = result % 50;
            } else if(result >= 40) {
                int temp = result / 40;
                for(int i = 0; i < temp; i++) {
                    sb.append("XL");
                }
                result = result % 40;
            }else if(result >= 10) {
                int temp = result / 10;
                for(int i = 0; i < temp; i++) {
                    sb.append("X");
                }
                result = result % 10;
            } else if(result >= 9) {
                int temp = result / 9;
                for(int i = 0; i < temp; i++) {
                    sb.append("IX");
                }
                result = result % 9;
            }else if(result >= 5) {
                int temp = result / 5;
                for(int i = 0; i < temp; i++) {
                    sb.append("V");
                }
                result = result % 5;
            } else if(result >= 4) {
                int temp = result / 4;
                for(int i = 0; i < temp; i++) {
                    sb.append("IV");
                }
                result = result % 4;
            }else {
                int temp = result / 1;
                for(int i = 0; i < temp; i++) {
                    sb.append("I");
                }
                result = result % 1;
            }
        }
        String ans = sb.toString();
       
        return ans;
    }
}