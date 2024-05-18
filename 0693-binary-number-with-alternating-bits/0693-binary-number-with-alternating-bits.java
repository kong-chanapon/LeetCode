class Solution {
    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for(int i=1; i<bits.length(); i++){
            if(bits.charAt(i-1) == bits.charAt(i))
                return false;
        }
        return true;
    }
}