class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];

        List<Integer> list = new ArrayList<>();    
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                list.add(i);
            }
        }

        int[] charIndex = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(charIndex));

        int left = charIndex[0];
        int right = charIndex[0];
        int count = 0;
        for(int i=0; i<ans.length; i++){
            if(i != right){
                if(count == 0 || count == charIndex.length){
                    ans[i] = Math.abs(i-right);
                }else if(count > 0){
                    ans[i] = Math.min(Math.abs(i-left), Math.abs(i-right));
                }
            }else{
                if(count+1 < charIndex.length){
                    count++;
                    left = right;
                    right = charIndex[count];
                }
            }
            
        }


        return ans;
    }
}
/*
ex loveleetcode
    0 1 2 [3] 4 [5] [6] 7 8 9 10 [11]
    c[3, 5, 6, 11]
    []-0-[3] -> 3
    []-1-[3] -> 2
    []-2-[3] -> 1
    3 -> 0

    [3]-4-[5] -> min(abs(3-4), abs(4-6)) -> 1
    5 -> 0
    [5]-...-[6]
    6 -> 0
    
    [6]-7-[11] -> min(abs(6-7), abs(7-11)) -> 1
    [6]-8-[11] -> min(abs(6-8), abs(8-11)) -> 2
    [6]-9-[11] -> min(abs(6-9), abs(9-11)) -> 2
    [6]-10-[11] -> min(abs(10-9), abs(10-11)) -> 1
    11 -> 0

    [11]-...-[]
*/