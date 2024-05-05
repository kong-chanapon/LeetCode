class Solution {
    public int firstUniqChar(String s) {
        Set<Character> checked = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!checked.contains(c)){
                if(s.indexOf(c, i+1) == -1){
                    return i;
                }
                
                checked.add(c); 
            }
        }

        return -1;
    }
}