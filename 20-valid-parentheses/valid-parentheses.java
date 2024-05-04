class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(char c: s.toCharArray()){
            if(!myStack.empty() && c == ')'){
                if(myStack.pop() == '('){
                    continue;
                }else{
                    return false;
                }
            }if(!myStack.empty() && c == ']'){
                if(myStack.pop() == '['){
                    continue;
                }else{
                    return false;
                }
            }if(!myStack.empty() && c == '}'){
                if(myStack.pop() == '{'){
                    continue;
                }else{
                    return false;
                }
            }else{
                myStack.push(c);
            }
        }

        return myStack.empty();
    }
}