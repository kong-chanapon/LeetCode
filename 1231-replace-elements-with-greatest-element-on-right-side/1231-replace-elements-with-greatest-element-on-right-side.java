class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[ans.length-1] = -1;

        int max = arr[arr.length-1];
        for(int i=arr.length-1; i>=1; i--){
            if(arr[i] > max){
                max = arr[i];
            }
            ans[i-1] = max;
        }


        return ans;
    }
}

/*
    arr = [17,18,5,4,6,1]
    17, -> [18,5,4,6,1] = 18
    18, -> [5,4,6,1] = 6
    5, -> [4,6,1] = 6
    4, -> [6,1] = 6
    6, -> [1] = 1
    1, = -1

    O(n^2) -> time out


     arr = [17,18,5,4,6,1]
     ans = [-1] 
    
    index[5], max = 1, ans = [1,-1]
    index[4], max = 6, ans = [6, 1,-1]
    index[3], max = 6, ans = [6, 6, 1,-1]
    index[2], max = 6, ans = [6, 6, 6, 1,-1]
    index[1], max = 18, ans = [18, 6, 6, 6, 1,-1]
    
    O(n)
 */