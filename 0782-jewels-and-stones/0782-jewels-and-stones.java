class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> setJewels = new HashSet<>();
        for(char j: jewels.toCharArray())
            setJewels.add(j);

        int ans = 0;
        for(char s: stones.toCharArray()){
            if(setJewels.contains(s))
                ans++;
        }
        
        return ans;
    }
}