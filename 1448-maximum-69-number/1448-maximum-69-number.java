class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);

        int count = str.length()-1;
        for(char c: str.toCharArray()){
            if(c == '6'){
                break;
            }
            count--;
        }

        // System.out.println(temp);

        if(count >= 0){
            num -= 6*Math.pow(10, count);
            num += 9*Math.pow(10, count);
        }


        return num;
    }
}