public class Solution {
    public int MinimumOperations(int[] nums) {
        int ans = 0;

        foreach(int num in nums)
        {
            if(num % 3 != 0)
                ans++;
        }

        return ans;
    }
}