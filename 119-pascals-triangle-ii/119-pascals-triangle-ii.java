class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            if(i!=0) {
                row.add(1);
            }
            for(int j = 0 ; j < i-1; j++) {
                List<Integer> before = res.get(i-1);
                row.add(before.get(j)+ before.get(j+1));
            }
            row.add(1);
            res.add(row);
        }
        return res.get(rowIndex);
    }
}