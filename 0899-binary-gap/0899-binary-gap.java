class Solution {
    public int binaryGap(int n) {
    String b = Integer.toBinaryString(n);
    int ans = 0;

    int start = b.indexOf('1', 0);
    int next = b.indexOf('1', start+1);
    while(next > 0){
        ans = Math.max(ans, next-start);
        start = next;
        next = b.indexOf('1', start+1);
    }

        
    return ans;
    }
}
