class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        Set<Integer> checked = new HashSet<>();
        for(int n = left; n<=right; n++){
            int bit = Integer.bitCount(n);
            if(bit != 1){
                if(checked.contains(bit)){
                    ans++;
                }else{
                    if(isPrime(bit)){
                        ans++;
                        checked.add(bit);
                    }
                }
            }
        }

        return ans;
    }

    public boolean isPrime(int n){
        int count = 2;
        while(count <= Math.sqrt(n)){
            if(n % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}