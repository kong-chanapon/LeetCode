class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] newNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(newNums, (n1, n2)->{
            if(n1 % 2 == 0 && n2 % 2 != 0){
                return -1;
            }else if(n1 % 2 != 0 && n2 % 2 == 0){
                return 1;
            }else{
                return 0;
            }
        });

        return Arrays.stream(newNums).mapToInt(Integer::intValue).toArray();
    }
}