class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> r = new HashMap<>();
        Map<Character, Integer> m = new HashMap<>();

        for(char c: ransomNote.toCharArray()){
            if(!r.containsKey(c)){
                r.put(c, 1);
            }else{
                r.put(c, r.get(c)+1);
            }
        }

        for(char c: magazine.toCharArray()){
            if(!m.containsKey(c)){
                m.put(c, 1);
            }else{
                m.put(c, m.get(c)+1);
            }
        }

        for(char c: r.keySet()){
            if(!m.containsKey(c) || r.get(c) > m.get(c)){
                return false;
            }
        }


        return true;
    }
}