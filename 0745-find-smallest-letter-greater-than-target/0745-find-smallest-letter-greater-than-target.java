class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        Set<Integer> asciiLetters = new HashSet<>();
        for(char c: letters){
            if(c != target){
                asciiLetters.add((int)c);
            }
        }
        
        int asciiTarget = (int) target;
        while(asciiTarget < 123){
            if(asciiLetters.contains(asciiTarget)){
                ans = (char) asciiTarget;
                break;
            }
            asciiTarget++;
        }

        return ans;
    }
}