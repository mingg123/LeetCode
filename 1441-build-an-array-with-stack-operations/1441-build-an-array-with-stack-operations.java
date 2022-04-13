class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < target.length; i++) {
            arr.add(target[i]);
        }
        List<String> ans = new ArrayList<>();
        boolean isflag = false;
        for(int i = 1; i <=target[target.length-1]; i++) {
            ans.add("Push");
            if(i == target[target.length-1] && target[target.length-1] == ans.size()) break;
            if(!arr.contains(i)) {
                ans.add("Pop");
            }
        }
        return ans;
    }
}