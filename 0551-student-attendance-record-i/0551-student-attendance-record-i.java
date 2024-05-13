class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        int count = 0;

        char temp = 'P';
        for(char c: s.toCharArray()){
            if(c == 'A'){
                countA++;
            }else if(c == 'L'){
                count++;
            }


            if(temp == 'L' && c != 'L'){
               countL = Math.max(countL, count);
               count = 0;
            }

            temp = c;


            if(countA >= 2 || countL >= 3){
                return false;
            }

        }

        if(temp == 'L'){
            countL = Math.max(countL, count);
            count = 0;
        }

         if(countA >= 2 || countL >= 3){
                return false;
        }

        return true;
    }
}

// A < 2
// 3 or more consecutive days LLL LLLL LLLL ...