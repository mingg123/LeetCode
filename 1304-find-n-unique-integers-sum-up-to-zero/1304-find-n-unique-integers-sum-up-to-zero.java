class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n/2; i++) {
            arr.add(i);
            arr.add(-1 * i);
        }
        if(n % 2 == 1) {
            arr.add(0);
        }
        Collections.sort(arr);
        int [] ans = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i++) {
            // System.out.println(arr.get(i));
            ans[i] = arr.get(i);
        }
        return ans;
    }
}