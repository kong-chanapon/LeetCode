class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> odds = new Stack<>();
        Stack<Integer> evens = new Stack<>();
        for(int n: nums){
            if(n % 2 == 0){
                evens.push(n);
            }else{
                odds.push(n);
            }
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length; i++){
            if(i % 2 == 0 && !evens.empty()){
                ans[i] = evens.pop();
            }else if(i % 2 == 1 && !odds.empty()){
                ans[i] = odds.pop();
            }
        }
        
        return ans;
    }
}