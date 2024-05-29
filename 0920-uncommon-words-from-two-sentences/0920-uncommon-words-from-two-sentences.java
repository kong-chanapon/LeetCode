class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> ans = new HashSet<>();

        Map<String, Integer> word1 = new HashMap<>();
        for(String w: s1.split(" ")){
            word1.put(w, word1.getOrDefault(w, 0)+1);
        }

        Map<String, Integer> word2 = new HashMap<>();
        for(String w: s2.split(" ")){
            word2.put(w, word2.getOrDefault(w, 0)+1);
        }

        for(String w: word1.keySet()){
            if(word1.get(w) == 1 && !word2.containsKey(w)){
                ans.add(w);
            }
        }
        for(String w: word2.keySet()){
            if(word2.get(w) == 1 && !word1.containsKey(w)){
                ans.add(w);
            }
        }
        

    

        return ans.toArray(String[]::new);
    }
}