class Solution {
    public int searchInsert(int[] nums, int target) {
       
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] == target) {
               return i;
           }
       }
        if(nums.length == 1) {
            return nums[0] > target ? 0 : 1;
        }
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < target && nums[i+1] > target) {
                return i+1;
            } else if(nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}