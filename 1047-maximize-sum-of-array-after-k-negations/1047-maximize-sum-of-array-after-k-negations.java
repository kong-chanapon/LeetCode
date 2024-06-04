class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum  = 0;
        while(k-- > 0){ 
            sum = 0;  
            Arrays.sort(nums);
            nums[0] = nums[0] * (-1);
            for(int n: nums){
                sum += n;
            }
            
        }

        return sum;
    }
}

/*
    nums = [3,-1,0,2], k = 2
    [-3, -1, 0, 2] = -2
    [3, 1, 0, 2] = 6 -> i = 1
    [3, -1, 0, 2] = 4
    [3, -1, 0, -2] = 0

    nums = [3, 1, 0, 2], k = 1
    [-3, 1, 0, 2] = 0
    [3, -1, 0, 2] = 4
    [3, 1, 0, 2] = 6 -> 2
    [3, 1, 0, -2] = 2

    nums = [3, 1, 0, 2] -> 2 = 6

    time out
    -----------------------------
    nums = [-1,0,2,3], k = 2

    sort
    change last 
    [1,0,2,3] = 4

    sort
    [0,1,2,3] = 4
 */