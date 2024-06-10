class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int n: arr1)
            map.put(n, map.getOrDefault(n, 0)+1);

        int[] ans = new int[arr1.length];
        int i = 0;
        int temp;
        for(int key: arr2){
            if(map.containsKey(key)){
                temp = map.remove(key);
                Arrays.fill(ans, i, i+temp, key);
                i += temp;
            }
        }

        if(!map.isEmpty()){
            for(int key: map.keySet()){
                temp = map.get(key);
                Arrays.fill(ans, i, i+temp, key);
                i += temp;
            }
        }

        return ans;
    }
}

/*
    arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]

    sort arr1 = [1,2,2,2,3,3,4,6,7,9,19] -> map = [1:1, 2:3, 3:2, 4:1, 6:1, 7:1, 9:1, 19:1]

    ans = [2,2,2,1,4,3,3,9,6], map = [7:1, 19:1]

    ans = [2,2,2,1,4,3,3,9,6,7,19]




 */