class Solution {
    public boolean isPowerOfTwo(int n) {
        double result = (Math.log(n) / Math.log(2)) % 1;
        return  Math.abs(result - 0) < 0.0000000001 ? true : false;
    }
}
