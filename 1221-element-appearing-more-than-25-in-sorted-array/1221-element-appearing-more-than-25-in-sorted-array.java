class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr)
            map.put(num, map.getOrDefault(num, 0)+1);


        for(int num: map.keySet()){
            if(map.get(num) > (double)arr.length/100*25){
                return num;
            }
        }

        return -1;
    }
}

/*
    arr = [1,2,2,6,6,6,6,7,10] -> length = 10, 25% -> 10/100*25 = 2.5 -> 3  


 */