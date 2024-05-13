class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        if(s.length() < k){
            return sb.append(s).reverse().toString();
        }

        String stringK = s.substring(0, k);
        sb.append(reverseSub(stringK));

        String sting2K = s.substring(k);
        int count = 0;
        String temp = "";
        for(char c: sting2K.toCharArray()){
            count++;
            if(count < k+1){
                sb.append(c);
            }else{
                temp += String.valueOf(c);
            }

            if(count == 2*k){
                sb.append(reverseSub(temp));
                temp = "";
                count = 0;
            }
        }

        sb.append(reverseSub(temp));
      
        return sb.toString();
    }

    public String reverseSub(String s){
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString();
    }
}

// "abcdefg", k=2, 2k=4 -> "ab cd ef g" -> "ba cd fe g"
// "abcd" -> "ab cd" -> "bacd"

// "abcdefgabcdefg", k=3, 2k=6 -> "abc def gab ced fg" -> "cba def bag ced fg"

//count k=2 2=4 ,,..,,..,,..,,

