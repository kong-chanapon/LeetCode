class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int temp = 0;

        if(matrix.length == 1 || matrix[0].length == 1){
            return true;
        }

        //bottom-right
        for(int x=0; x<matrix[0].length-1; x++){
            for(int y=0; y<matrix.length; y++){
                if(y == 0){
                    temp = matrix[y][x];
                }else{
                    if(x+y < matrix[y].length && matrix[y][x+y] != temp){
                        return false;
                    }
                }
            }
        }

        for(int y=1; y<matrix.length-1; y++){
            for(int x=0; x<matrix[0].length; x++){
                if(x == 0){
                    temp = matrix[y][x];
                }else{
                    if(y+x < matrix.length && matrix[y+x][x] != temp){
                        return false;
                    }
                }
            }
        }
      

        return true;
    }
}

//matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
// 0,0 - 1,1 - 2,2
// 0,1 - 1,2 - 2,3
// 0,2 - 1,3
// 1,0 - 2,1