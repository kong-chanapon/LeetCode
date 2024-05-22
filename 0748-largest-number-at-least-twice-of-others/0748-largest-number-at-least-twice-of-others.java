class Solution {
    public int dominantIndex(int[] nums) {
        int indexMaxValue = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[indexMaxValue]){
                indexMaxValue = i;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i != indexMaxValue && nums[indexMaxValue] < nums[i]*2){
                return -1;
            }
        }


        return indexMaxValue;
    }
}