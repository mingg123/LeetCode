import java.nio.charset.StandardCharsets;
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        byte[] bytes = columnTitle.getBytes(StandardCharsets.US_ASCII);
        int temp = 1;
        for(int i = bytes.length-1; i >= 0; i--) {
            ans+= (bytes[i] - 64) * temp;
            temp = temp * 26;
        }
        return ans;
    }
}

