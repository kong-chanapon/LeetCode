class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key) == nums.length/2){
                return key;
            }
        }

        return -1;
    }
}