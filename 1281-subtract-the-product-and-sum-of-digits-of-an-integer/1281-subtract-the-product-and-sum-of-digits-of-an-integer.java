class Solution {
    public int subtractProductAndSum(int n) {
        int digits = 1;
        int sum = 0;
        String[] num = Integer.toString(n).split("");
        for(int i = 0; i < num.length; i++) {
            digits *= Integer.parseInt(num[i]);
            sum += Integer.parseInt(num[i]);
        }
        return digits - sum;
    }
}