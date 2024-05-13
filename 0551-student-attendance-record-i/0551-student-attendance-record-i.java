class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        int count = 0;

        char temp = 'P';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                countA++;
            }else if(s.charAt(i) == 'L'){
                count++;
            }


            if(temp == 'L' && s.charAt(i) != 'L' || i == s.length()-1 && s.charAt(i) == 'L'){
               countL = Math.max(countL, count);
               count = 0;
            }

            temp = s.charAt(i);

            if(countA >= 2 || countL >= 3){
                return false;
            }

        }

        return true;
    }
}

// A < 2
// 3 or more consecutive days LLL LLLL LLLL ...