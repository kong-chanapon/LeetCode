class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        int ans = 0;
        int p = binary.length()-1;
        for(char bit: binary.toCharArray()){
            if(bit == '0'){
                ans += Math.pow(2, p);
            }
            p--;
        }

        return ans;
    }
}