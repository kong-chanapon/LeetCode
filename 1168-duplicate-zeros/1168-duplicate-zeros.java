class Solution {
    public void duplicateZeros(int[] arr) {
        int temp1;
        int temp2; 
        int i=0;
        while(i<arr.length){
            if(arr[i] == 0 && i<arr.length-1){

                temp1 = arr[i+1];
                arr[i+1] = 0;

                for(int j=i+2; j<arr.length; j++){
                    temp2 = arr[j];
                    arr[j] = temp1;
                    temp1 = temp2;
                }                
                i+=2;
            }else{
                i++;
            }
        }
    }
}

/*

    case return int[]

    arr = [1,0,2,3,0,4,5,0] length = 8
    ans = [0,0,0,0,0,0,0,0] length = 8

    arr[i] = 1, ans[1]
    arr[i] = 0, ans[1, 0, 0]
    arr[i] = 2, ans[1, 0, 0, 2]
    arr[i] = 3, ans[1, 0, 0, 2, 3]
    arr[i] = 0, ans[1, 0, 0, 2, 3, 0, 0]
    arr[i] = 4, ans[1, 0, 0, 2, 3, 0, 0, 4]

    ---------------------------------------

    case void
    arr = [1,0,2,3,0,4,5,0], next=0
    arr = [1,0,2,3,0,4,5,0], next=1
    arr = [1,0,0,2,3,0,4,5], next=3



 */