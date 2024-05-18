class Solution {
    public int findShortestSubArray(int[] nums) {
        int ans = Integer.MAX_VALUE;

        if(nums.length == 0)
            return ans;
        
        Map<Integer, Integer> b = new HashMap<>();
        Map<Integer, Integer> e = new HashMap<>();
        Map<Integer, Integer> c = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!c.containsKey(nums[i])){
                c.put(nums[i], c.getOrDefault(nums[i], 0)+1);
                b.put(nums[i], i);
                e.put(nums[i], i);
            }else{
                c.put(nums[i], c.getOrDefault(nums[i], 0)+1);
                e.put(nums[i], i);
            }
        }

        int d = Collections.max(c.values());

        for(int n: c.keySet()){
            if(c.get(n) == d){
                ans = Math.min(ans, e.get(n) - b.get(n) + 1);
            }
        }
    
        


        return ans;
    }


}
//nums = [1,2,2,3,1]

//mapBegin [1:0], mapEnd [1:0], mapCount  [1:1]
//b [1:0, 2:1], e [1:0, 2:1], c[1:1, 2:1]
//b [1:0, 2:1], e [1:0, 2:2], c[1:1, 2:2]
//...
//b [1:0, 2:1, 3:3] e[1:4, 2:2, 3:3] c[1:2, 2:2, 3:1]
//max(c) = 2
//min(e(c)-b(c))