class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W");

        Set<String> setBanned = new HashSet<>();
        for(String s: banned)
            setBanned.add(s);

        Map<String, Integer> mapWord = new HashMap();
        for(String word: words){
            if(!setBanned.contains(word) && !word.equals("")){
                mapWord.put(word, mapWord.getOrDefault(word, 0)+1);
            }
        }

        System.out.println(mapWord);
        
        if(mapWord.size() == 0){
            return "";
        }

        int max = Collections.max(mapWord.values());
    
        for(String word: mapWord.keySet()){
            if(mapWord.get(word) == max){
                return word;
            }
        }

        return "";
    }
}