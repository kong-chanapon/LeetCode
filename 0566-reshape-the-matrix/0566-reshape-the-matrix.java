class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                nums.add(mat[i][j]);
            }
        }

        int ans[][] = new int[r][c];
        int count = 0;
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j] = nums.get(count);
                count++;
            }
        }


        return ans;
    }
}

//mat = [[1,2],[3,4]], r = 1, c = 4
// r*c = elements -> 1*4 = 4, mat.length = m mat[0].length = n -> 2*2 = 4


//mat = [[1,2],[3,4]], r = 2, c = 4  
// r*c = 8, mat.length = m mat[0].length = n -> 2*2 = 4 not possible