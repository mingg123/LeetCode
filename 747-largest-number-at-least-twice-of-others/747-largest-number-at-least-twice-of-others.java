class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIdx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        boolean isflag = false;
        for(int i = 0; i < nums.length; i++) {
            if(max == nums[i]) continue;
            if(max < nums[i] * 2) {
                isflag = true;
                break;
            }
        }
        return isflag ? -1 : maxIdx;
    }
}