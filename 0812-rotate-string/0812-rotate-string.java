class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.equals(s)){
                return true;
        }

        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length-1; i++){

            char prev = chars[chars.length-1];
            char curr;

            for(int j=0; j<chars.length; j++){
                curr = chars[j];
                chars[j] = prev;
                prev = curr;
            }

            if(goal.equals(String.valueOf(chars))){
                return true;
            }
        }

        return false;
    }
}

//a b c
//c a b
//b c a
//a b c