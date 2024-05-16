class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(!set.contains(n)){
                set.add(n);
            }else{
                ans[0] = n;
            }
        }

        for(int n=1; n<=nums.length; n++){
            if(!set.contains(n)){
                ans[1] = n;
                break;
            }
        }

        

        return ans;
    }
}
