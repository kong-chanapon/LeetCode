class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int n:arr){
            sum += n;
        }

        if(sum % 3 != 0){
            return false;
        }

        
        int part = 3;
        int temp = 0;
        for(int n: arr){
            temp += n;
            if(temp == sum/3){
                part--;
                temp = 0;
            }
        }


        return part <= 0 ? true : false;
    }
}

/*
    [................]
    [X X X]
    3X

    arr = [3,3,6,5,-2,2,5,1,-9,4]
    sumAll = 18
    18 % 3 = 0 ?

    18 / 3 = 6
    [... = 6, ... = 6, ... = 6,]
 */