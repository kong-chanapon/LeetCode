class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0;
        int line = 1;
        int width;

        for(char c: s.toCharArray()){
            width = widths[((int)c)-97];
            if(count+width > 100){
                line++;
                count = width;
            }else{
                count += width;
            }
        }

        int[] result = new int[]{line, count};

        return result;
    }
}

//a -> 97 -> 97-97 -> 0
//z -> 122 -> 122-97 -> 25