class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        int taget = 1;

        for(int i=0; i<nums.length; i++){
            if(taget == nums[i]){
                count++;
                ans = Math.max(ans, count);
            }else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return ans;
    }
}