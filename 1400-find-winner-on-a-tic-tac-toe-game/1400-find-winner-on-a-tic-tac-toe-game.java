class Solution {
    public String tictactoe(int[][] moves) {
        int[][][] wins = {
            {{0,0},{0,1},{0,2}},
            {{1,0},{1,1},{1,2}},
            {{2,0},{2,1},{2,2}},

            {{0,0},{1,0},{2,0}},
            {{0,1},{1,1},{2,1}},
            {{0,2},{1,2},{2,2}},

            {{0,0},{1,1},{2,2}},
            {{0,2},{1,1},{2,0}},
        };

        
        Set<int[]> pointA = new HashSet<>();
        Set<int[]> pointB = new HashSet<>();

        for(int i=0; i<moves.length; i++){
            if(i%2==0){
                pointA.add(moves[i]);
            }else{
                pointB.add(moves[i] );
            }
        }


        for(int[][] points: wins){
            int counterA = 0;
            int counterB = 0;

            for(int[] point: points){

                for(int[] a: pointA){
                    if(point[0] == a[0] && point[1] == a[1])
                        counterA++;           
                }

                for(int[] b: pointB){
                    if(point[0] == b[0] && point[1] == b[1])
                        counterB++;           
                }
            }
        

            if(counterA == 3){
                return "A";
            }else if(counterB == 3){
                return "B";
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}

/*
    Tic Tac Toe Game 3x3 
    1. wins -> [
        [[0, 1], ... [0, 2]]
        [[0, 1], ... [0, 2]]
        ....
    ]

    pointA:[....]
    pointB:[....]

    pointA containsAll ?
    pointB  containsAll?
 */