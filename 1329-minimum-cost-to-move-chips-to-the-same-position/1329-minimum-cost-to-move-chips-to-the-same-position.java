class Solution {
    public int minCostToMoveChips(int[] position) {

        int even = 0;
        int odd = 0;

        for(int n:position){
            if(n % 2 == 1){
                odd++;
            }else{
                even++;
            }
        }

        return Math.min(odd, even);
    }
}

/*

    position = [1,2,2,2,2,3,3,4]  -> 2
    ans = Int.max;

    1 =  occurrence nums on right [2,2,2,2] ans = 4
    2 =  occurrence nums on left and right [1,3,3] ans = 3
    3 =  occurrence nums on left and right [2,2,2,2,4] ans = 3
    4 =  occurrence nums on left [3,3] = 2

    occurrence counter [1,4,2,1] 

    incorrect

    -------------------------------------------------
     position = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]
     position = [2,(3,1)]
     position = [(3,1)(4,2)]
     position = [(4,2)(5,3,1)]
        ....
    position = [(29,27,25,23,21,19,17,15,13,11,9,7,5,3,1)(30,28,26,24,22,20,18,16,14,12,10,8,6,4,2)]

    position = [1,2,2,2,2,3,3,4]
    
    Odd = 5  Even = 3

    min(odd, even) = 3

   -------------------------------------------------


 */