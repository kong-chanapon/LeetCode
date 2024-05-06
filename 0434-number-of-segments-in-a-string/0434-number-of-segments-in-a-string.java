class Solution {
    public int countSegments(String s) {
        int ans = 0;
        for(String t: s.split("\\s+")){
            if(!t.equals(""))
                ans++;
        }
        return ans;
    }
}