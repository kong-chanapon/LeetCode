class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        for(int i = 1; i<s.length(); i++){
            int prev = i-1;
            int current = i;

            if(s.charAt(prev) != s.charAt(current)){
                count++;

                int next = 1;
                while(prev - next >= 0 && current + next < s.length()){
                    if(s.charAt(prev) == s.charAt(prev-next) && s.charAt(current) == s.charAt(current+next)){
                        count++;
                    }else{
                        break;
                    }
                    next++;
                }
            }
        }

        return count;
    }
}
// s = "01", "10" -> 1 
// s = "0011","1100" -> 2
// s = "000111", "111000" -> 3
// s = "00001111", "11110000" -> 4

// s = "010", "101" -> 2
// s = "0110", "1001" -> 2
// s = "11100", "00111" -> 2
// s = "00011100" -> 5

//s = "00110011" -> 01 -> 0011 -> 10 -> 1100 -> 01 > 0011