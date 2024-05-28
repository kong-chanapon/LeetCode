class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];

        int n;
        for(int y = 0; y<image.length; y++){
            n = image.length-1;
            for(int x=0; x<image[y].length; x++){
                    ans[y][n-x] = image[y][x];
                    if(ans[y][n-x] == 1){
                        ans[y][n-x] = 0;
                    }else{
                        ans[y][n-x] = 1;
                    }
            }
            
        }

        return ans;
    }
}