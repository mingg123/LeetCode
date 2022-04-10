class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        int temp = original;
        for(;;) {
            if(!arr.contains(temp)) {
                break;
            } else {
                temp = temp*2;
            }
        }
        return temp;
    }
}