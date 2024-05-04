class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int index1=0; index1<nums.length; index1++){
            for(int index2=index1+1; index2<nums.length; index2++){
                if(nums[index1] + nums[index2] == target){
                    ans[0] = index1;
                    ans[1] = index2;
                    break;
                }
            }
        }
        return ans;
    }
}