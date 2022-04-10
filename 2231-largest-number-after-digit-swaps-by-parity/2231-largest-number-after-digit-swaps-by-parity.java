class Solution {
    public int largestInteger(int num) {
        char [] list = Integer.toString(num).toCharArray();
        for(int i = 0; i < list.length; i++) {
            for(int j = i+1; j < list.length; j++) {
                if(list[j] > list[i] && (list[j] - list[i])% 2 == 0) {
                    char temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return Integer.parseInt(new String(list));
    }
}