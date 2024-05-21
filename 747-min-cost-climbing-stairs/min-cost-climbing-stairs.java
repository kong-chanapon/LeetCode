class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //1. create graph
        //2. create prefixMinNode
        //3. check prefixMinNode [length-2], [length-1]

        Map<Integer, int[]> graph = new HashMap<>();
        for(int i=1; i<cost.length; i++){
            if(i == 1){
                graph.put(i, new int[]{0});
            }else if(i == cost.length-1){
                graph.put(i, new int[]{i-1});
            }else{
                graph.put(i, new int[]{i-1, i+1});
            }
        }

        // System.out.println(graph);
        int[] prefixMinNode = new int[cost.length];
        prefixMinNode[0] = cost[0];
        for(int i=1; i<prefixMinNode.length; i++){
            if(i == 1){
                prefixMinNode[i] = Math.min(prefixMinNode[i-1] + cost[i], cost[i]);
            }else{
                prefixMinNode[i] = Math.min(prefixMinNode[i-1]+cost[i], prefixMinNode[i-2]+cost[i]);
            }
        }
        System.out.println(Arrays.toString(prefixMinNode));
        

        return Math.min(prefixMinNode[prefixMinNode.length-1], prefixMinNode[prefixMinNode.length-2]);
    }
}

// cost = [1,100,1,1,1,100,1,1,100,1]


// 0 -> 1, 2
// 1 -> 2, 3

// 2 -> 3, 4
// 3 -> 4, 5
// 4 -> 5, 6
// 5 -> 6, 7
// 6 -> 7, 8
// 7 -> 8, 9
// 8 -> 9
// 9 -> 

// 0 <-
// 1 <- 0
// 2 <- 1, 3
// 3 <- 2, 5
/// ...
/// 8 <- 6, 7
// 9 <- 8

//min[1] 0 -> 1 = 101

// 0 -> 2 = 1+1 = 2
// 1 -> 2 = 100+1 = 101
//min[2] 0 -> 2  = 2

// 1 -> 3 = 101+1 = 102
// 2 -> 3 = 2+1 = 3
//min[3] 2 -> 3 = 3

// 2 -> 4 = 2+1 = 3
// 3 -> 4 = 3+1 = 4
//min[4] 2 -> 4 = 3

// 3 -> 5 = 3+100 = 103
// 4 -> 5 = 3+100 = 103
//min[5] 3 -> 5 = 3+100 = 103

// 4 -> 6 = 3+1 = 4
// 5 -> 6 = 103 = 104
//min[6] 4 -> 6 = 4

// 5 -> 7 = 103+1 = 104
// 6 -> 7 = 4+1 = 5
//min[7] 6 -> 7 = 5

// 6 -> 8 = 4+100 = 104
// 7 -> 8 = 5+100 = 105
//min[8] 6 -> 8  = 104

// 7 -> 9 = 5+1 = 6
// 8 -> 9 = 104+1 = 105
//min[9] 7 -> 9 = 6

//check min[length-2], min[length-1]


