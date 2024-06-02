class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return n;
            }else{
                set.add(n);
            }
        }

        return -1;
    }
}