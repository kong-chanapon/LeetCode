class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int ans = m*n;
        int c = m;
        int r = n;

        for(int[] op: ops){
            c = Math.min(op[0], c);
            r = Math.min(op[1], r);
            ans = c*r;
        }

        return ans;
    }
}


 