class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.containsKey(key+1)){
                ans = Math.max(ans, map.get(key)+map.get(key+1));
            }
        }
       
        return ans;
    }
}

//difference between its maximum value and its minimum value is exactly 1
//nums = [1,3,2,2,5,2,3,7] -> [2,2,2,3,3] 
//nums = [1,2,3,4] -> [1, 2], [2, 3], [3, 4]
//nums = [1,1,1,1] -> []


// TreeMap 1:1, 2:3, 3:2, 5:1, 7:1
// 1 -> 2 ? -> v1+v2 = 4
// 2 -> 3 ? -> 3+2 = 5
// 3 -> 4 ?
// 5 -> 6 ?
// 7 -> 8 ?
