class Solution {
    public int romanToInt(String s) {
        char[] char_str = s.toCharArray();
        int result = 0;
        int skip = -1;
        for(int i = 0; i < char_str.length; i++){
            if(skip == i){
                continue;
            }

            if(char_str[i] == 'I'){
                if(i == char_str.length-1){
                    result += 1;
                }
                else if(char_str[i+1] == 'V'){
                    result += 4;
                    skip = i+1;
                }
                else if(char_str[i+1] == 'X'){
                    result += 9;
                    skip = i+1;
                }
                else{
                    result += 1;
                }
            }
            else if(char_str[i] == 'V'){
                result += 5;
            }
            else if(char_str[i] == 'X'){
                if(i == char_str.length-1){
                    result += 10;
                }
                else if(char_str[i+1] == 'L'){
                    result += 40;
                    skip = i+1;
                }
                else if(char_str[i+1] == 'C'){
                    result += 90;
                    skip = i+1;
                }
                else{
                    result += 10;
                }
            }
            else if(char_str[i] == 'L'){
                result += 50;
            }
            else if(char_str[i] == 'C'){
                if(i == char_str.length-1){
                    result += 100;
                }
                else if(char_str[i+1] == 'D'){
                    result += 400;
                    skip = i+1;
                }
                else if(char_str[i+1] == 'M'){
                    result += 900;
                    skip = i+1;
                }
                else{
                    result += 100;
                }
            }
            else if(char_str[i] == 'D'){
                result += 500;
            }
            else if(char_str[i] == 'M'){
                result += 1000;
            }
        }

        return result;
    }
}