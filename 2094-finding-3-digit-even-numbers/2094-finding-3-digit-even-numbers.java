class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int [] count = new int[10];
        List<Integer> res = new LinkedList();
        for(int i = 0; i < digits.length; i++) {
            count[digits[i]]++;
        }
        for(int i = 1; i<=9; i++) {
            if(count[i] == 0) continue;
            count[i]--;
            for(int j = 0; j <= 9; j++) {
                if(count[j]==0) continue;
                count[j]--;
                for(int k = 0; k <=9; k+=2) {
                    if(count[k] == 0) continue;
                    res.add(i*100 + j * 10 + k);
                 }
                count[j]++;
            }
            count[i]++;
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}