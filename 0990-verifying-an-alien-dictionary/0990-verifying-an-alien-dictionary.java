class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1){
            return true;
        }

        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            dict.put(order.charAt(i), i);
        }

        for(int i=1; i<words.length; i++){

            if(!isBefore(words[i-1].toCharArray(), words[i].toCharArray(), dict))
                return false;

        }   

        return true;
    }

    private boolean isBefore(char[] prev, char[] curr, Map<Character, Integer> dict){
        int maxLength = Math.max(prev.length, curr.length);
        char[] charsPrev = new char[maxLength];
        char[] charsCurr = new char[maxLength];

        for(int i=0; i<maxLength; i++){
            if(i < prev.length){
                charsPrev[i] = prev[i];
            }

            if(i < curr.length){
                charsCurr[i] = curr[i];
            }
        }

        for(int i=0; i<maxLength; i++){
            if(charsCurr[i] == '\u0000' && curr.length < prev.length){
                return false;
            }else if(charsPrev[i] == '\u0000'){
                return true;
            }else if(dict.get(charsPrev[i]) < dict.get(charsCurr[i])){
                return true;
            }else if(dict.get(charsPrev[i]) > dict.get(charsCurr[i])){
                return false;
            }
        }

        return true;
    }
}