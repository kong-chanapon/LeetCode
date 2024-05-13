class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuilder ans = new StringBuilder();
        
        for(String word: words){
            StringBuilder sb = new StringBuilder(word);
            ans.append(sb.reverse());
            ans.append(' ');
        }
        

        return ans.substring(0, ans.length()-1);
    }
}