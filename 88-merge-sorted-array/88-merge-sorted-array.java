class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int [] result = new int[n+m];
        int num1Idx = 0;
        int num2Idx = 0;
        for(int i = 0; i < result.length; i++) {
            if(num1Idx < m && num2Idx < n) {
                if(nums1[num1Idx] < nums2[num2Idx]) {
                    result[i] = nums1[num1Idx];
                    num1Idx++;
                } else {
                    result[i] = nums2[num2Idx];
                    num2Idx++;
                }
            }
            else if(num1Idx >= m) {
                result[i] = nums2[num2Idx];
                num2Idx++;
            } else {
                result[i] = nums1[num1Idx];
                num1Idx++;
            }
        }
        for(int i = 0; i < result.length; i++) {
           nums1[i] = result[i];
        }
    }
}