class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        sol(res, "(", n-1, n);
        return res;
    }
    
    public void sol(List<String> res, String s, int open, int close) {
        if(open ==0 && close ==0) {
            res.add(s);
            return;
        }
        if(open > 0) {
            sol(res, s+ "(", open-1, close);
        }
        if(close > open) {
            sol(res, s+ ")", open, close-1);
        }
    }
}