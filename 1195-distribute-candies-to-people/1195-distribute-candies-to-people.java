class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int num = 0;
        while(candies > 0){
            for(int i=0; i<ans.length; i++){
                num++;
                if(candies-num >= 0){
                    ans[i] += num;
                    candies -= num;
                }else{
                   ans[i] += candies;
                   candies = 0;
                }
            }
        }
        

        return ans;
    }
}

