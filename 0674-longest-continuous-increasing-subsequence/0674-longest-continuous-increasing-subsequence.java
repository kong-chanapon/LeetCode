class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int diff = 0;
        int ans = 1;

        for(int i=1; i<nums.length; i++){
            int diffNew = nums[i] - nums[i-1];

            if(diffNew <= 0){
                ans = Math.max(ans, count);

                diff = diffNew;
                count = 1;

            }else if(diffNew > 0){
                count++;
            }

            if(i == nums.length-1){
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
//nums = [1,3,5,4,7]
// count = 1, 
// current = 1, next = 3 -> diff = 2 -> diff > 0 count++
// current = 3, next = 5 -> diff = 2 -> diff > 0 count++
// current = 3, next = 4 -> diff = -1 ->  not increasing subsequence 
// current = 4, next = 7 -> diff = 3 -> diff > 0  count++

//nums = [2,2,2,2,2]
// count = 1, diff = 0
// current = 2, next = 2 -> diff = 0 -> not increasing subsequence
// current = 2, next = 2 -> diff = 0 -> not increasing subsequence 


//[0,1,3,5,4,7]
/// count = 1, diff = 0
// current = 0, next = 1 -> diff = 1 -> diff > 0 count++
// current = 1, next = 3 -> diff = 2 -> diff > 0 count++