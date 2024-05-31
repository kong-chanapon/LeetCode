class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ans = new char[s.length()];
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                list.add(s.charAt(i));
            }else{
                ans[i] = s.charAt(i);
            }
        }

        Collections.reverse(list);

        Character[] reverse = list.toArray(new Character[list.size()]);
        int count = 0;
        for(int i=0; i<ans.length; i++){
            if(ans[i] == '\u0000'){
                ans[i] = reverse[count++];
            }
        }

        return String.valueOf(ans);
    }
}

/*
    s = "a-bC-dEf-ghIj"
    sb = "_ - _ _ - _ _ _ - _ _ _ _"
    letters = [a,b,C,d,E,f,g,h,I,j]
    reverse = [j,I,h,g,f,E,d,C,b,a]
*/