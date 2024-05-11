class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>();
        for(char c: "qwertyuiop".toCharArray()){
            row1.add(c);
        }

        Set<Character> row2 = new HashSet<>();
        for(char c: "asdfghjkl".toCharArray()){
            row2.add(c);
        }

        Set<Character> row3 = new HashSet<>();
        for(char c: "zxcvbnm".toCharArray()){
            row3.add(c);
        }


        List<String> ans = new ArrayList<>();

        for(String s:words){
            Set<Character>  w = new HashSet<>();
            for(char c: s.toLowerCase().toCharArray()){
                w.add(c);
            }

            if(row1.containsAll(w)){
                ans.add(s);
            }else if(row2.containsAll(w)){
                ans.add(s);
            }else if(row3.containsAll(w)){
                ans.add(s);
            }
        }

        System.out.println(ans);
 
        return  ans.stream().toArray(String[]::new);
    }
}