class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return arr;
        }


        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int num: copy){
            if(!map.containsKey(num)){
                map.put(num, rank++);
            }
        }


        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}

/*
    arr = [40,10,20,30,100,100]
    sort = [10, 20,30, 40, 100, 100]
    map = [1:10, 2:20, 3:30, 4:40, 5:100]

    arr [4, 1, 2, 3, 5, 5]


 */