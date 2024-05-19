class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        boolean sd = true;
        for(int i=left; i<=right; i++){
            for(char n: String.valueOf(i).toCharArray()){
                sd = true;
                if(Character.getNumericValue(n) == 0 || i % Character.getNumericValue(n) != 0){
                    sd = false;
                    break;
                }
            }

            if(sd){
                ans.add(i);
            }
            sd = true;
        }

        return ans;
    }
}