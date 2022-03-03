import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    if(sum > Math.abs(target - temp)) {
                        sum = Math.abs(target-temp);
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}