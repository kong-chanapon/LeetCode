class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] newNums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(newNums));
        if(newNums.length < 3){
            return newNums[newNums.length-1];
        }else{
            return newNums[newNums.length-3];
        }
    }
}
