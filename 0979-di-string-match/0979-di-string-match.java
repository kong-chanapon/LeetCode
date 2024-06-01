class Solution {
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length()+1];
        for(int i=0; i<s.length()+1; i++)
            perm[i] = i;

        int temp;
        int curr;
        for(int i=1; i<perm.length; i++){
            if(s.charAt(i-1) == 'D' && perm[i-1] < perm[i]){
                temp = perm[i-1];
                perm[i-1] = perm[i];
                perm[i] = temp;
                
                for(int prev=i-2; prev>=0; prev--){;
                    if(s.charAt(prev) == 'D' && perm[i-1] > perm[i]){
                        temp = perm[prev];
                        perm[prev] = perm[prev+1];
                        perm[prev+1] = temp;
                    }else{
                        break;
                    }
                }
            }
        }

        return perm;
    }
}

/*
    s = "IDID"
    perm = [0, 1, 2, 3, 4]
    s[0] = I -> 0 < 1
    s[1] = D -> 1 > 2 -> [0, 2, 1, 3, 4]
    s[2] = I -> 1 < 3 
    s[3] = D -> 3 > 4 -> [0, 2, 1, 4, 3]

    s = "DDI"
    perm = [0, 1, 2, 3]
    0 > 1 -> [1, 0, 2, 3]
    0 > 2 -> [1, 2, 0, 3]

    1 > 2 -> [2, 1, 0, 3]

    0 < 3 -> [2, 1, 0, 3]


 */