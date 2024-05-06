class Solution {
    public String addStrings(String num1, String num2) {
       Stack<Character> temp1 = new Stack();
       Stack<Character> temp2 = new Stack();

        char[] ans;

        if(num1.length() < num2.length()){
            for(char c: num1.toCharArray()){
                temp1.push(c);
            }
            for(char c: num2.toCharArray()){
                temp2.push(c);
            }
        }else{
            for(char c: num2.toCharArray()){
                temp1.push(c);
            }
            for(char c: num1.toCharArray()){
                temp2.push(c);
            }
        }
        
        int over = 0;
        ans = new char[temp2.size()];
        int i = temp2.size()-1;


        while(!temp2.empty()){
            int n1 = 0;
            int n2 = Character.getNumericValue(temp2.pop());

            if(!temp1.empty()){
                n1 = Character.getNumericValue(temp1.pop());
            }
            

            int sum = n1 + n2 + over;

            if(sum < 10){
                ans[i] = Character.forDigit(sum, 10);
                over = 0;
            }else{
                String sumString = String.valueOf(sum);
                ans[i] = sumString.charAt(1);
                over = Character.getNumericValue(sumString.charAt(0));
            }

            i--;
        }


        return over == 0 ? String.valueOf(ans): String.valueOf(over) + String.valueOf(ans);
    }
}
