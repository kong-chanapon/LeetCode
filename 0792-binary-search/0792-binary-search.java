class Solution {
    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int mid;

        while(begin <= end){
            mid = begin + (end - begin)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                begin = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}