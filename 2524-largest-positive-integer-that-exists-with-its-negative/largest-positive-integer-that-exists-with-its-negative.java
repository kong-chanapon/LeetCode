class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> setP = new HashSet<>();
        Set<Integer> setN = new HashSet<>();

        for(int n :nums){
            if(n > 0){
                setP.add(n);
            }else{
                setN.add(n);
            }
        }

        Integer max = 0;

        while(!setP.isEmpty()){
            max = Collections.max(setP);
            if(!setN.contains(-max)){
                    setP.remove(max);
            }
            else{
                break;
            }
        }

        if(setP.isEmpty()){
            return -1;
        }else{
            return max;
        }

    }
}