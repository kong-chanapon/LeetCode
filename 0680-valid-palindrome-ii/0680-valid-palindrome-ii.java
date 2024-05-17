class Solution {
    public boolean validPalindrome(String s) {
        for(int f=0; f<s.length(); f++){
           int b = s.length()-f-1;
           if(s.charAt(f) != s.charAt(b)){
                return isPalindrome(s, f+1, b) || isPalindrome(s, f, b-1);
           }
        }

        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}
