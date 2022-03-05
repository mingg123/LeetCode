import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger binaryTo = new BigInteger(a,2);
        BigInteger binaryTo2 = new BigInteger(b,2);
        return binaryTo.add(binaryTo2).toString(2);
    }
}