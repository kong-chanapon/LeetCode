class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int num: arr)
            set.add(num);

        List<List<Integer>> ans = new ArrayList<>();
        int counter = 1;

        while(ans.size() <= 0){
            for(int num: set){
                if(set.contains(num+counter)){
                    ans.add(Arrays.asList(num, num+counter));
                }
            }
            counter++;
        }

        return ans;
    }
}

/*
    ex1

    arr = [1,3,6,10,15] 
    count = 1 
    1+1 contains arr ?
    3+1 contains arr ?
    ....

    count = 2
    .....
    
    ex2 find diff min

    abs(1-3) = 1
    abs(1-6) = 5
    abs(1-10) = 9
    abs(1-15) = 14
    abs(3-6) = 3
    ....




 */