class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i+=2){
            int ferq = nums[i];
            int val = nums[i+1];
            Integer[] arr = new Integer[ferq];
            Arrays.fill(arr, val);
            list.addAll(Arrays.asList(arr));
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}