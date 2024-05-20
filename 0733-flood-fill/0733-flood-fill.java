class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Map<Integer, ArrayList<Integer>> graph = new TreeMap<>();
        Set<Integer> checked = new HashSet<>();

        for(int r=0; r<image.length; r++){
            for(int c=0; c<image[r].length; c++){

                graph.put(r*image[r].length+c, new ArrayList<>());
                
                
                if(r < image.length-1 && image[r][c] == image[r+1][c]){
                    //image[r+1][sc]
                    graph.get(r*image[r].length+c).add((r+1)*image[r].length+c);
                }

                if(r > 0 && image[r][c] == image[r-1][c]){
                    //image[r-1][c]
                    graph.get(r*image[r].length+c).add((r-1)*image[r].length+c);
                }

                if(c < image[r].length-1 && image[r][c] == image[r][c+1]){
                    //image[r][c+1]
                    graph.get(r*image[r].length+c).add(r*image[r].length+(c+1));
                }

                if(c > 0 && image[r][c] == image[r][c-1]){
                    //image[r][c-1]
                    graph.get(r*image[r].length+c).add(r*image[r].length+(c-1));
                }

            }
        }

        // System.out.println(graph);
        // System.out.println(checked);
        changeColor(checked, graph, sr*image[0].length+sc);
        // System.out.println(checked);

        for(int n: checked){
            image[n/image[0].length][n%image[0].length] = color;
        }

         
        return image;
    }


    private void changeColor(Set<Integer> checked, Map<Integer, ArrayList<Integer>> graph, int target){
        // System.out.printf("t: %s\n", target);
        checked.add(target);
        for(int n: graph.get(target)){
            if(!checked.contains(n)){
                checked.add(n);
                changeColor(checked, graph, n);
            }
        }
    }


}

/// 2d [m,n] -> 1d [m*3+n]
//[0*3,0] = 0,  [0*3, 1] = 1, [0*3, 2] = 2 
//[1*3, 0] = 3, [1*3, 1] = 4, [1*3, 2] = 5


// 1d to graph Map sameValue
// 0 -> 1, 3 
// 1 -> 0, 2, 4
// 2 -> 1
// 3 -> 0, 4, 6
// 4 -> 1, 3
// 5 -> 
// 6 -> 3
// 7 -> 
// 8 -> 

// sr = 1, sc = 1 color = 2 -> 4
// 4 set = 2 checked[4]
// 4 -> 1, 3 

// 1 set = 2 checked[4,1]
// 1 -> 0, 2, 4

// 0 set = 2 checked[4, 1, 0]
// 0 -> 1, 3

//3 set = 2 checked[4, 1, 0, 3]
//3 -> 0, 4, 6

//6 set = 2 checked[4, 1, 0, 3, 6]
//6 -> 3

//2 set = 2 checked[4, 1, 0, 3, 6, 2]
// 2 -> 1

//1d -> 2d
// 0 -> 0/3, 0%3 -> 0, 0
// 4 -> 4/3, 4%3 -> 1, 1 
// 5 -> 5/3, 5%3 -> 1, 2
// 9 -> 8/3, 8%3 -> 2, 2

