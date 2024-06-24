class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];

        int a = 0;
        int b = 0;
        for(int i=1; i<n; i++){
            a = i;
            b = n-i;

            if(isZero(a) && isZero(b)){
                ans[0] = a;
                ans[1] = b;
                break;
            }
        }


        
        return ans;
    }

    private boolean isZero(int n){
        String str = String.valueOf(n);
        for(char c: str.toCharArray()){
            if(c == '0'){
                return false;
            }
        }

        return true;
    }
}

/*

No-Zero integer is a positive integer 2 <= n <= 10,000

 */