class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();

        for(int i=0; i<emails.length; i++){
            String[] temp = emails[i].split("@");

            StringBuilder sb = new StringBuilder();
            for(char c: temp[0].toCharArray()){
                if(c == '+'){
                    break;
                }
                else if(c != '.'){
                    sb.append(c);
                }
            }

            ans.add(sb.toString()+"@"+temp[1]);
        }

        return ans.size();
    }
}

