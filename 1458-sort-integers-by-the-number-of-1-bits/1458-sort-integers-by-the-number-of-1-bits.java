class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int num: arr){
            int bitCount = Integer.bitCount(num);
            if(!map.containsKey(bitCount)){
                List<Integer> temp = new ArrayList<>();
                temp.add(num);
                map.put(bitCount, temp);
            }else{
                map.get(bitCount).add(num);
            }
        }

        for(int key: map.keySet()){
            ans.addAll(map.get(key));
        }
            
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}