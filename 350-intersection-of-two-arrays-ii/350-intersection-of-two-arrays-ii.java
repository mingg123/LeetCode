class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i])+1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for(int i = 0; i < nums2.length; i++) {
            if(map1.containsKey(nums2[i])) {
                map1.put(nums2[i], map1.get(nums2[i])+1);
            } else {
                map1.put(nums2[i], 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer key : map.keySet()) {
            if(map1.containsKey(key)) {
                int count = Math.min(map.get(key), map1.get(key));
                for(int i = 0; i < count; i++) {
                    arr.add(key);
                }
            }
           
        }
        Collections.sort(arr);
        int [] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}