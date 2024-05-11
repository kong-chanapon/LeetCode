class Solution {
    public String convertToBase7(int num) {
        int temp = Math.abs(num);
        StringBuilder ans = new StringBuilder();

        if(temp == 0){
            ans.append('0');
        }

        while(temp != 0){
            ans.append(temp % 7);
            temp = temp / 7;
        }

        return num < 0 ? ans.reverse().insert(0, '-').toString() : ans.reverse().toString();
    }
}


// 100/7 -> 14 , 2  -> 14/7 -> 2, 0 -> 2/7 -> 0, 2  -> 202

// 7/7 -> 1, 0 -> 1/7 -> 0, 1 -> 01 -> -10

// 0/7 -> 0, 0
