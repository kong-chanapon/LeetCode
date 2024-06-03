class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        for(int i=nums.length-3; i>=0; i--){
            if(nums[i]+nums[i+1] > nums[i+2]){
                ans = Math.max(ans, nums[i]+nums[i+1]+nums[i+2]);
            }

        }

        return ans;
    }
}


/*
    Sort nums;
    Is triangle than a+b >= c

 */