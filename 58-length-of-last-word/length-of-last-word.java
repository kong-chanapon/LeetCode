class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split("\s+");
        return strs[strs.length-1].length();
    }
}