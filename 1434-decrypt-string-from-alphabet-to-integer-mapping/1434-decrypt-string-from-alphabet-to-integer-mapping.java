class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int index = s.length()-1;
        String digits = "";
        while(index >= 0){
            if(s.charAt(index) == '#'){
                digits += String.valueOf(s.charAt(index-2));
                digits += String.valueOf(s.charAt(index-1));
                System.out.println(digits);
                ans.insert(0, (char)(Integer.valueOf(digits)+96));
                index -= 3;
                digits = "";
            }else{
                ans.insert(0, (char)(Character.digit(s.charAt(index), 10)+96));
                index--;
            }
        }

        return ans.toString();
    }



}