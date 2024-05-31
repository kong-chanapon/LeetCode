class Solution {
    public boolean isMonotonic(int[] nums) {
       
        boolean isIncrease = false;
        boolean isDecrease = false;

        int start = 1;
        while(start < nums.length){
            if(nums[start-1] < nums[start]){
                isIncrease = true;
                break;
            }else if(nums[start-1] > nums[start]){
                isDecrease = true;
                break;
            }
            start++;
        }

        if(!isIncrease && !isDecrease){
            return true;
        }
    
        int curr;

        if(isIncrease){
            for(int i = start+1; i<nums.length; i++){
                if(nums[i-1] > nums[i]){
                    return false;
                }
            }
        }else{
            for(int i = start+1; i<nums.length; i++){
                if(nums[i-1] < nums[i]){
                    return false;
                }
            }
        }

        return true;
    }
}