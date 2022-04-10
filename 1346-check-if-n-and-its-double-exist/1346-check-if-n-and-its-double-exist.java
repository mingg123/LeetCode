class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int zerocount = 0;
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(arr[i] == 0) {
                zerocount++;
            }
        }
        if(zerocount >=2) return true;
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0 && list.contains(list.get(i)*2)) {
                return true;
            }
        }
        return false;
    }
}