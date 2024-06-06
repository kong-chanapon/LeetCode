class Solution {
    public boolean divisorGame(int n) {
        
        return n % 2 == 0 ? true : false;
    }
}

/* 
    n = 2
    alice -> 1  2%1 == 0
    n = 1

    alice is win the game
    ------------------------

    n = 3
    alice -> 1
    n = 2
    alice is lose the game

   ------------------------

   n = 4 ?
   alice -> 1, 2 -> 1
   n = 3 
   alice is win the game

    -------------------------

    n = 5 
    alice = 1
    n = 4 
    alice is lose the game

    ------------------------

    n = 6
    alice = 1, 2, 3 -> 2
    n = 4 
    alice is win the game


    So, play begin n % 2 == 0  win the game
*/