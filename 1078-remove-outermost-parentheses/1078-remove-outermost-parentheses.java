class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        int start = 0;
        boolean isStart = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                count--;
            }

            if(!isStart && count != 0){
                sb.append(s.charAt(i));
            }


            if(count == 0){
                isStart = true;
            }
            else if(count == 1 && isStart){
                isStart = false;
            }

            
        }

        return sb.toString();
    }
}