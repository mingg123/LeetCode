class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int dist = 0;
        for(int i = 0; i < colors.length; i++) {
            int start = colors[i];
            for(int j = colors.length-1; j >i; j--) {
                if(colors[j] != start) {
                    dist = Math.max(dist, j - i);
                }
            }
        }
        return dist;
    }
}