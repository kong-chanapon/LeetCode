class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=2; i<nums.length; i++){
            int[] t = new int[3];
            t[0] = nums[i-2];
            t[1] = nums[i-1];
            t[2] = nums[i];

            ans = Math.max(ans, perimeterTriangle(t));

        }

        return ans;
    }

    private int perimeterTriangle(int[] t){
        if(t[0]+t[1] > t[2]){
            return t[0]+t[1]+t[2];
        }

        return 0;
    }
}


/*
    Sort nums;
    Is triangle than a+b >= c

 */