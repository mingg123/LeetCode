class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i= i+2) {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 0; j < freq; j++) {
                ans.add(val);
            }
        }
        int [] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}