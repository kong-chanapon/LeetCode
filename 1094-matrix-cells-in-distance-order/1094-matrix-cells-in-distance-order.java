class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        Integer[][] points = new Integer [rows*cols][2];

        int count = 0;
        for(int j=0; j<rows; j++){
            for(int k=0; k<cols; k++){
                points[count][0] = j;
                points[count][1] = k;
                count++;
            }
        }

        Arrays.sort(points, (p1, p2)->{
            double temp1 = Math.abs(p1[0] - rCenter) + Math.abs(p1[1] - cCenter);
            double temp2 = Math.abs(p2[0] - rCenter) + Math.abs(p2[1] - cCenter);
            if(temp1 < temp2){
                return -1;
            }else if(temp1 > temp2){
                return 1;
            }else{
                return 0;
            }
        });


        int[][] ans = new int[rows*cols][2];

        for(int i=0; i<points.length; i++){
            ans[i][0] = points[i][0];
            ans[i][1] = points[i][1];
        }

        return ans;
    }
}

/*
    1. create points x,y from row,cols
    2. sort


 */