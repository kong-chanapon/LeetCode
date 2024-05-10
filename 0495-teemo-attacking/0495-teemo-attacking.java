class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;

        int begin;
        int end;
        int next;
        for(int i = 0; i < timeSeries.length; i++){
            begin = timeSeries[i];
            end = begin + duration -1;

            if(i != timeSeries.length-1){
                next = timeSeries[i+1];
                if(end >= next){
                    ans += next - begin;
                }else{
                    ans += end - begin + 1;
                }
            }else{
                ans += end - begin + 1;
            }
        }

        return ans;
    }
}


// [1,4] d = 2 -> [1, 2] +2 next != 2 -> [4, 5] +2  result = 4
// [1, 3] d = 3-> [1, 3] next == 3 -> 3-1 = 2 