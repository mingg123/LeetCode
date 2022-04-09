class Solution {
    public String tictactoe(int[][] moves) {
        int [][] result = new int [3][3];
        String str = "Pending";

        //1이면 A 
        for(int k = 0; k < moves.length; k++) {
            int x = moves[k][0];
            int y = moves[k][1];
            
            if(k == 0 || k%2 == 0) {
                result[x][y] = 1;
            }
            else {
                result[x][y]= 2;
            }
             //가로 검사 
            for(int i = 0; i < result.length; i++) {
                int num = result[i][0];
                boolean isflag = false;
                for(int j = 1; j < 3; j++) {
                    if(num != result[i][j]){
                        isflag = true;
                        break;
                    }
                }
                if(!isflag) {
                   if(num == 1) {
                       str = "A";
                   } else if(num ==2) {
                       str = "B";
                   }
                }
            }
            if(str.equals("A")|| str.equals("B")) {
                return str;
            }
            // 세로 검사 
            for(int i = 0; i < 3; i++) {
                int num = result[0][i];
                boolean isflag = false;
                for(int j = 1; j < 3; j++) {
                    if(num != result[j][i]){
                        isflag = true;
                        break;
                    }
                }
                if(!isflag) {
                   if(num == 1) {
                       str = "A";
                   } else if(num ==2) {
                       str = "B";
                   }
                }
            }
            if(str.equals("A")|| str.equals("B")) {
                return str;
            }
            // 대각선 검사 
            int num = result[0][0];
            boolean isflag = false;
            for(int i = 1; i < 3; i++) {
                if(num!= result[i][i]) {
                    isflag = true;
                    break;
                }
            }
            if(!isflag) {
               if(num == 1) {
                   str = "A";
               } else if(num ==2) {
                   str = "B";
               }
            }
            if(str.equals("A")|| str.equals("B")) {
                return str;
            }
            num = result[0][2];
            isflag = false;
            for(int i = 1; i < 3; i++) {
                if(num!= result[0+i][2-i]) {
                    isflag = true;
                    break;
                }
            }
            if(!isflag) {
               if(num == 1) {
                   str = "A";
               } else if(num ==2) {
                   str = "B";
               }
            }
            if(str.equals("A")|| str.equals("B")) {
                return str;
            }
            if(k == 8) return "Draw";
        }
        return str;
    }
}