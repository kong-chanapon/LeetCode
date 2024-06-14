class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int ans = 0;
        for(char c: s.toCharArray()){
            if(c == 'R'){
                r++;
            }else{
                l++;
            }

            if(r == l){
                ans++;
                r = 0;
                l = 0;
            }
        }

        return ans;
    }
}

/*

 s = "RLRRRLLRLL"
 temp = "R"
 temp = "RL" 

 temp = "R"
 temp = "RR"
 temp = "RRR"
 temp = "RRRL"
 temp = "RRRRLL"
 temp = "RRRLLRLL"

 */