class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> map = new HashMap<>();
        for(char c: chars.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        int ans = 0;
        for(String word: words){
            if(word.length() <= chars.length()){

                Map<Character, Integer> wordMap = new HashMap<>();

                for(char c: word.toCharArray())
                    wordMap.put(c, wordMap.getOrDefault(c, 0)+1);

                boolean isContainsAll = true;
                
                for(char c: wordMap.keySet()){
                    if(!map.containsKey(c) || map.get(c) < wordMap.get(c)){
                        isContainsAll = false;
                        break;
                    }
                }

                if(isContainsAll){
                    ans += word.length();
                }

            }
        }

        return ans;
    }
}