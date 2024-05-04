class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int n: nums){
            if(myMap.containsKey(n)){
                myMap.put(n, myMap.get(n)+1);
            }else{
                myMap.put(n, 1);
            }
        }

        for(int k: myMap.keySet()){
            if(myMap.get(k) == 1){
                return k;
            }
        }
        return nums[0];
    }
}


