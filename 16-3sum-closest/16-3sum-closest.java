import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target-sum);
                if(diff==0) return sum;
                if(diff < min) {
                    min = diff;
                    result = sum;
                }
                if(sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}