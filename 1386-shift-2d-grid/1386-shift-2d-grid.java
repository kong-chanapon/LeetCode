class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] temp1 = new int[grid.length*grid[0].length];
         int width = grid[0].length;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                temp1[width*i+j] = grid[i][j];
            }
        }

        // System.out.println(Arrays.toString(temp1));

        int[] temp2 = new int[grid.length*grid[0].length];
        for(int i=0; i<temp1.length; i++){
            temp2[(i+k)%temp1.length] = temp1[i];
        }

        // System.out.println(Arrays.toString(temp2));


        List<List<Integer>> ans = new ArrayList<>();
        int count = 0;
        List<Integer> temp3 = new ArrayList<>();
        for(int i=0; i<temp2.length; i++){
            temp3.add(temp2[i]);
            count++;

            if(count % width == 0){
               ans.add(temp3);
               temp3 = new ArrayList<>();
            }

        }
        
        return ans;
    }
}

/*
    2D -> 1D 
    1D shift k
    1D -> 2D 
    
    0 0 -> 0
    0 1 -> 1
    0 2 -> 2
    width(3) * 1+0 -> 3
    1 1 -> 4

    1 shift 1 -> (1+1)%9 = 2
    9 shift 1 -> (9+1)%9 = 1

 */