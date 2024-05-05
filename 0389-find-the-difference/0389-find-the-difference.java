class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char ans = t.charAt(0);

        for(char c: t.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }

        for(char c: s.toCharArray()){
            map.put(c, map.get(c)-1);
        }

        for(char c: map.keySet()){
            if(map.get(c) == 1){
                ans = c;
                break;
            }
        }

        return ans;
    }
}