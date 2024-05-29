class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for(int y=0; y<matrix[0].length; y++){
            for(int x=0; x<matrix.length; x++){
                ans[y][x] = matrix[x][y];
            }
        }

        return ans;
    }
}

/*

    0,0 0,1 0,2
    1,0 1,1 1,2 
    2,0 2,1 2,2 

    0,0 1,0 2,0
    0,1 1,1 2,1
    0,2 1,2 2,2

    -----------
    y=2 x=3

    0,0 0,1 0,2
    1,0 1,1 1,2 

    x=3 y=2
    0,0 1,0 
    0,1 1,1
    0,2 1,2

   
*/