class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int m = (s+e)/2;
        while(s <= e){
            m = (s+e)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        
        return nums[m] < target ? m+1 : m;
    }
}