import java.lang.StringBuilder;
class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(String i: s.split("\\W|_")){
            newString += i;
        }
        StringBuilder sb = new StringBuilder(newString.toLowerCase());
        return newString.toLowerCase().equals(sb.reverse().toString());
    }
}