import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int temp = target-nums[i];
            if(list.contains(temp)) {
                int index = list.indexOf(temp);
                if(i!= index) {
                    result[0] = i;
                    result[1] = index;
                }
            }
        }
        Arrays.sort(result);
        return result;
    }
}