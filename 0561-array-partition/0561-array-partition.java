class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        for(int i=1; i<nums.length; i+=2){
            ans += (int)Math.min(nums[i-1], nums[i]);
        }

        return ans;
    }
}

// nums = [1,4,3,2], n=2 -> min(a, b) * 2
// nums = [6,2,6,5,1,2], n=3 -> min(a, b) * 3

// [1, 2, 3, 4] -> min(1, 2) + min(3, 4) = 4
// [1, 2, 2, 5, 6, 6] -> min(1, 2) + min(2, 5), + min(6, 6) = 1 + 2 + 6 = 9
