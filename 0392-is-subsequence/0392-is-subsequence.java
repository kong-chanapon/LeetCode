class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;

        if(s.length() == 0){
            return true;
        }

        for(char c: t.toCharArray()){
            if(c == s.charAt(count)){
                count++;
            }

            if(count >= s.length()){
                break;
            }
        }

        return count == s.length() ? true:false;
    }
}