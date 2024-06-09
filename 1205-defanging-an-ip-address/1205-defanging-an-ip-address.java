class Solution {
    public String defangIPaddr(String address) {
        String[] stringSplit = address.split("");
        StringBuilder sb = new StringBuilder();
        for(String s: stringSplit){
            if(s.equals(".")){
                sb.append("[.]");
            }else{
                sb.append(s);
            }
        }

        return sb.toString();
    }
}