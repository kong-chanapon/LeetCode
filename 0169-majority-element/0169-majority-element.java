class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int n: nums){
            myMap.put(n, myMap.getOrDefault(n, 0)+1);
           
        }

        for(int key: myMap.keySet()){
            if(myMap.get(key) > nums.length/2){
                return key;
            }
        }

        return nums[0];
    }
}