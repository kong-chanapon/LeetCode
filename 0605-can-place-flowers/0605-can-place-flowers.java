class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }else if(flowerbed.length == 1 && flowerbed[0] == 1 && n == 1){
            return false;
        }else if(flowerbed.length == 1 && flowerbed[0] == 0 && n == 1){
            return true;
        }

        int prev;
        int next;

        for(int c=0; c<flowerbed.length; c++){
            if(flowerbed[c] == 0){

                if(c == 0){
                    next = c+1;
                    if(flowerbed[next] != 1){
                        flowerbed[c] = 1;
                        n--;
                    }
                }else if(c > 0 && c < flowerbed.length -1){
                    prev = c-1;
                    next = c+1;
                    if(flowerbed[prev] != 1 && flowerbed[next] != 1){
                        flowerbed[c] = 1;
                        n--;
                    }
                }else{
                    prev = c-1;
                    if(flowerbed[prev] != 1){
                        flowerbed[c] = 1;
                        n--;
                    }
                }


            }

            if(n == 0){
                return true;
            }
        }

        return false;
    }
}

//use 3 pointer -> prev, current, next

//ex flowerbed = [1,0,0,0,1], n = 2
// p = 1, c = 1; n = 0; -> n != 1 ? 