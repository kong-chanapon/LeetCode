class NumArray {
    public int[] prefixNums;

    public NumArray(int[] nums) {
        this.prefixNums = new int[nums.length+1];
        this.prefixNums[0] = 0;

        for(int i = 1; i<prefixNums.length; i++){
            this.prefixNums[i] = nums[i-1] + this.prefixNums[i-1];
        }

        System.out.println(Arrays.toString(this.prefixNums));
    }
    
    public int sumRange(int left, int right) {
        return this.prefixNums[right+1] - this.prefixNums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */