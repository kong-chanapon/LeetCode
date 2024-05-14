class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for(int t: candyType)
            types.add(t);

        return (int)Math.min(types.size(), candyType.length/2);
    }
    
}

//candyType = [1,1,2,2,3,3] -> 1:2, 2:2, 3:2 -> n/2 = 3 -> keySet() = 3  ---> 3
//candyType = [1,1,2,3] -> 1:2, 2:1, 3:1 -> n/2 = 2 -> keySet() = 3  ---> 2
//candyType = [6,6,6,6] -> 6:4 -> n/2 = 2 -> keySet() = 1 ---> 1