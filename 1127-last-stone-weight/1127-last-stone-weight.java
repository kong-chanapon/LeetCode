class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());

        while(list.size() > 1){
            list.sort((s1, s2)->{
                return Integer.compare(s1,s2);
            });
            
            int y = list.remove(list.size()-1);
            int x = list.remove(list.size()-1);

            if(x != y){
                list.add(y-x);
            }

            // System.out.println(list);
        }


        return list.size() == 1 ? list.get(0): 0;
    }
}