class Solution {
    public int subtractProductAndSum(int n) {
        String[] nums = String.valueOf(n).split("");
        int p = Integer.valueOf(nums[0]);
        int sum = Integer.valueOf(nums[0]);

        for(int i=1; i<nums.length; i++){
            p *= Integer.valueOf(nums[i]);
            sum += Integer.valueOf(nums[i]);
        }

        return p-sum;
    }
}