class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double ans = Double.NEGATIVE_INFINITY;
        //Time Out
        // int start = 0;
        // double sum = 0;
        // for(int end = k-1; end<nums.length; end++){
        //     int index = start;
        //     while(index <= end){
        //         sum += nums[index++];
        //     }
        //     ans = Math.max(ans, sum/k);
        //     sum = 0;
        //     start++;
        // }

        double[] prefixSum = new double[nums.length];
        prefixSum[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        double ans = prefixSum[k-1]/k;

        for(int i=k; i<nums.length; i++){
            ans = Math.max(ans, (prefixSum[i] - prefixSum[i-k])/k);
        }

        return ans;    
    }
}

//nums = [1,12,-5,-6,50,3], n=6, k = 4

//s1 = [1,12,-5,-6] index 0-3 = 2
//s2 = [12,-5,-6,50] index 1-4 = 51
//s3 = [-5,-6,50,3] index 2-5 = 42

//prefixSum [1, 13, 8, 2, 52, 55]
//begin index 0-3 -> prefixSum[k-1]
// index 1-4 -> prefixSum[4 = k+0] - prefixSum[0]
// index 2-5 -> prefixSum[5 = k+1] - prefixSum[1]

