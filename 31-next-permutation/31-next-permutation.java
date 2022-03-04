class Solution {
    public void nextPermutation(int[] nums) {
        int N = nums.length;
        int target = 0;
        for(int i = N-1; i>=1; i--) {
            if(nums[i-1] < nums[i]) {
                target = i;
                break;
            }
        }
        if(target == 0) {
          Arrays.sort(nums);
          for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
          }
            return;
        }
        int min = Integer.MAX_VALUE;
        int minIdx= Integer.MAX_VALUE;
        for(int i = N-1; i>=target; i--) {
            if(nums[target-1] < nums[i] && min > nums[i]) {
                minIdx = i;
                min = nums[i];
            }
        }
        if(minIdx != Integer.MAX_VALUE) {
            int temp = nums[target-1];
            nums[target-1] = nums[minIdx];
            nums[minIdx] = temp;
        }
        for(int i = target; i < N; i++) {
            for(int j = target; j< N; j++) {
                if(nums[i] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}