class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        ans[1] = (int)Math.sqrt(area);
        
        for(int i = ans[1]; i>=1; i--){
            if(area % i == 0){
                ans[0] = area / i;
                ans[1] = i;
                break;
            }
        }

        return ans;
    
    }
}