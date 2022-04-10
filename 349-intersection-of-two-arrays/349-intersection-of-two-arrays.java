class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i]) && !result.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        Collections.sort(result);
        int [] ans = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}