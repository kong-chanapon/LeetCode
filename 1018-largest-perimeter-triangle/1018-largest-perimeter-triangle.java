class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=2; i<nums.length; i++){
            if(nums[i-2]+nums[i-1] > nums[i]){
                ans = Math.max(ans, nums[i-2]+nums[i-1]+nums[i]);
            }

        }

        return ans;
    }
}


/*
    Sort nums;
    Is triangle than a+b >= c

 */