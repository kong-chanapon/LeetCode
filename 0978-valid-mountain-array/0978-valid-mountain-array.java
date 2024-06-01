class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }

        boolean increase = false;
        boolean decrease = false;

        for(int i=1; i<arr.length; i++){
            if(!increase){
                if(arr[i-1] == arr[i]){
                    return false;
                }
                else if(arr[i-1] > arr[i]){
                    if(i == 1){
                        return false;
                    }else{
                        increase = true;
                    }
                }
            }else{
                if(arr[i-1] <= arr[i]){
                    return false;
                }
            }
        }
        decrease = true;



        return increase && decrease;
    }
}

/*
    arr.length >= 3
    increase = false, decrease = false;
    0 < 2 -> increase = true;
    2 < 3 -> increase = true;
    3 == 3 -> return false;


    arr = [0,3,2,1]
    increase = false, decrease = false;
    0 < 3 -> increase = true;
    3 < 2 -> decrease = true;
    2 > 1 -> decrease = true;

    arr = [0,3,2,1,5]
    1 > 5 -> false;
 */