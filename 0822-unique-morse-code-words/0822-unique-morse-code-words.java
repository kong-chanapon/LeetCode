class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = {".-","-...","-.-.","-..",".","..-."
                        ,"--.","....","..",".---","-.-",".-..",
                        "--","-.","---",".--.","--.-",".-.","...",
                        "-","..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> mapTable = new HashMap<>();
        int count = 0;
        for(int ascii = 97; ascii<=122; ascii++)
            mapTable.put((char)ascii, table[count++]);
        
        // System.out.println(mapTable);
        Set<String> tWord = new HashSet<>();
        for(String w: words){
            StringBuilder sb = new StringBuilder();

            for(char c: w.toCharArray()){
                sb.append(mapTable.get(c));
            }
            tWord.add(sb.toString());
        }

        return tWord.size(); 
        
    }
}