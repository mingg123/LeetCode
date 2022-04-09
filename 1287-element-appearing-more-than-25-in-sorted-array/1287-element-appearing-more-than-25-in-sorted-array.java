class Solution {
    public int findSpecialInteger(int[] arr) {
        // System.out.println(arr.length);
        int len = arr.length /4;
        // System.out.println(len);
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] == num) {
                    count++;
                    if(count > len) {
                        return num;
                    }
                } else {
                    break;
                }
            }
        }
        return arr[0];
    }
}