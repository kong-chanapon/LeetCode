class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charMap = new HashMap<>();
        String[] text = s.split("\s");

        if(text.length != pattern.length()){
            return false;
        }

        for(int i = 0; i<text.length; i++){
            char p = pattern.charAt(i);
            String t = text[i];

            if(!charMap.containsKey(p) && !charMap.containsValue(t)){
                charMap.put(p, t);
            }else{
                if(charMap.containsKey(p)){
                    if(!charMap.get(p).equals(t)){
                        return false;
                    }
                }else{
                    return false;
                }
            }

            System.out.println(charMap);

        }

        return true;
    }
}