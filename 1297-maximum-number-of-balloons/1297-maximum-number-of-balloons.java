class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
         
        

        boolean wordCondition = map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n') && map.get('b') >= 1 && map.get('a') >= 1 && map.get('l') >= 1 && map.get('o') >= 1 && map.get('n') >= 1;
        
        if(wordCondition){
            map.put('l', map.get('l') / 2);
            map.put('o', map.get('o') / 2);
            return Collections.min(map.values());
        }


        return 0;
    }
}

/* 
    balloon -> [b:1, a:1, l:2, o:2, n:1]

    ? -> [b:1, a:2, l:2, o:4, n:2] -> 1

    {a=20, b=15, l=21/2, n=15, o=21/2} -> {a=20, b=15, l=10, n=15, o=10} - 10

*/