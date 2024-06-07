class Solution {
    public String gcdOfStrings(String str1, String str2) {   
        StringBuilder sb = new StringBuilder();
        String ans = "";

        for(int i=0; i<str1.length(); i++){

            String temp1 = str1;
            String temp2 = str2;

            sb.append(str1.charAt(i));

            temp1 = temp1.replaceAll(sb.toString(), "");
            temp2 = temp2.replaceAll(sb.toString(), "");

            if(temp1.equals("") && temp2.equals("")){
                ans = sb.toString();
            }
            
        }


        return ans;      
    }
}

/*

    return the largest string x such that x divides both "str1 and str2"

    "t divides s" if and only if s = t + t + t + ... + t + t

    ----------------------

    str1 = "ABCABC", str2 = "ABC" ?

    "A" remove str1 = "BCBC", str2 = "BC"
    "AB" -> "CC" , "C"
    "ABC" -> "", ""


    str1 = "ABAAABAA" ?
    "A" -> "BB"
    "AB" -> "AAAA"
    "ABA" -> "AA"
    "ABAA" -> ""

 */