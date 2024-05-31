class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int diff = max-min;

        if(diff == 0){
            return 0;
        }

        return diff/2 < k ? 0 : (max-k) - (min+k);
        
    }
}


/*
    nums = [1], k = 0
    min = 1, max=1, k[0]
    diff = 0 

    nums = [0, 10], k = 2
    min = 0, max=10, k[-2, 1, 0, 1, 2]
    diff = 10 -> 10/2 = 5
    max - 2 = 8
    8 - 0 + 2 = 6


    nums = [1,3,6], k = 3
    min = 1, max=6, k[-3, -2, 1, 0, 1, 2, 3]
    diff = 6-1 = 5/2 = 2
    max - 2 = 4
    4 - 1 = 1 -> 0

    
    diff/2 < k ? 0: (max-k) - (min+k);

*/