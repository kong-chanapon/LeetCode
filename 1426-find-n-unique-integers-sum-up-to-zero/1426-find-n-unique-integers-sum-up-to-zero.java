class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int count = 0;
        int num = 1;

        if(n % 2 == 1){
            ans[0] = 0;
            count++;
        }

        while(count != n){
            ans[count] = num;
            ans[count+1] = -num;

            count+=2;
            num++;
        }

        return ans;
    }
}

/*

  n=1 -> [0]
  n=2 -> [-1,1]
  n=3 -> [-1,0,1]
  n=4 -> [-2,-1,1,2]
  n=5 -> [-2,-1,0,1,2]
  n=6 -> [-3-2,-1,1,2,3]

  So 
  n % 2 == 1 use 0, +-1...
  n % 2 == 0 use +-1...
 */