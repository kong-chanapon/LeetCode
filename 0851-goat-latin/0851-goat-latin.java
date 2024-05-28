class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder ans = new StringBuilder();

        String[] words = sentence.split("\\s");
        boolean con;
        char begin;
        for(int i=0; i<words.length; i++){
            con = words[i].matches("^[aeiouAEIOU].+");
            StringBuilder sb = new StringBuilder(words[i]);

            if(i > 0){
                ans.append(" ");
            }
            
            if(!con){
                begin = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(begin);
            }
            ans.append(sb);
            ans.append("ma");
            ans.append("a".repeat(i+1));

        }


        return ans.toString();
    }
}