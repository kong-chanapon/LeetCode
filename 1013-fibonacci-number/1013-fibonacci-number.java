class Solution {
    public int fib(int n) {
        int[] prefixSum = new int[n+2];
        prefixSum[0] = 0;
        prefixSum[1] = 1;
        for(int i=2; i<prefixSum.length; i++){
            prefixSum[i] =  prefixSum[i-1] +  prefixSum[i-2];
        }

        return  prefixSum[n];
    }
}

// F(n) = F(n - 1) + F(n - 2) -> min F(2) = F(2 - 1) + F(2 - 2) -> begin fixed f(0) = 0 , f(1) = 1
// f(1) [0, 1] -> f(3) [0, 1, 1] -> f(0) [0, 1] prefixSum length = N+2; 