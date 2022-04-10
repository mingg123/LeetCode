class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++) {
            // System.out.print(nums[i] + " ");
        // }
        while(k > 0) {
            nums[0] = nums[0] * -1;
            k--;
            Arrays.sort(nums);
           // for(int i = 0; i < nums.length; i++) {
                // System.out.print(nums[i] + " ");
            // }
            // System.out.println(" ");
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}