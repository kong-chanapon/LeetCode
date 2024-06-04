class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> curr = new HashMap<>();
        for(char c: words[0].toCharArray())
            curr.put(c, curr.getOrDefault(c, 0)+1);

        if(words.length == 1){
            return mapToList(curr);
        }

        for(int i=1; i<words.length; i++){
            Map<Character, Integer> next = new HashMap<>();
            for(char c: words[i].toCharArray())
                next.put(c, next.getOrDefault(c, 0)+1);
            
            Map<Character, Integer> temp = new HashMap<>();
            for(char c: curr.keySet()){
                if(next.containsKey(c)){
                    temp.put(c, Math.min(next.get(c), curr.get(c)));
                }
            }

            curr = temp;
        }

        return mapToList(curr);
    }

    private List<String> mapToList(Map<Character, Integer> map){
        List<String> list = new ArrayList<>();
        int count;
        for(char c: map.keySet()){
            count = map.get(c);
            while(count-- > 0){
                list.add(String.valueOf(c));
            }
        }

        return list;
    }

}

/*

    words = ["bella","label","roller"]
    ans = []
    "bella" -> b:1, e:1, l:2, a:1 
    "label" -> l:2, a:1, b:1, e:1 -> ans = [l:2, a:1, b:1, e:1]
    "roller" -> r:2, o:1, l:2, e:1,
    
    l in word ? yes min(word, ans) = 2
    a in word ? no
    b in word ? no
    e in ans ? yes e = min(word, ans) = 1
    ans = [l:2, e:1]
 */