class Solution {
    public int numRookCaptures(char[][] board) {
        //find rook position
        int y = 0;
        int x = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 'R'){
                    y = i;
                    x = j;
                    break;
                }
            }
        }

        int ans = 0;

        // System.out.printf("%s %s\n", y,x);

        //+y
        for(int i=y-1; i>=0; i--){
            if(board[i][x] == 'B'){
                break;
            }
            else if(board[i][x] == 'p'){
                ans++;
                break;
            }
        }

        //-y
        for(int i=y+1; i<board.length; i++){
            if(board[i][x] == 'B'){
                break;
            }
            else  if(board[i][x] == 'p'){
                ans++;
                break;
            }
        }

        //+x
        for(int i=x+1; i<board[y].length; i++){
            if(board[y][i] == 'B'){
                break;
            }
            else if(board[y][i] == 'p'){
                ans++;
                break;
            }
        }

         //-x
        for(int i=x-1; i>=0; i--){
            if(board[y][i] == 'B'){
                break;
            }
            else if(board[y][i] == 'p'){
                ans++;
                break;
            }
        }

        return ans;
    }
}
