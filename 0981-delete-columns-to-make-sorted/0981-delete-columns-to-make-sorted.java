class Solution {
    public int minDeletionSize(String[] strs) {
        if(strs.length == 1){
            return 0;
        }

    
        int counter = 0;
        // System.out.println(col);
        for(int col=strs[0].length()-1; col>=0; col--){
            for(int row=1; row<strs.length; row++){
                if(strs[row-1].charAt(col) > strs[row].charAt(col)){
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}
