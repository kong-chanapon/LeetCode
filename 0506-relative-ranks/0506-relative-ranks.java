class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] scoreSort = new Integer[score.length];

        for(int i=0; i<score.length; i++){
            scoreSort[i] = score[i];
        }

        Arrays.sort(scoreSort, Comparator.reverseOrder());

        System.out.println(Arrays.toString(scoreSort));

        Map<Integer, Integer> indexSort = new HashMap<>();
        for(int i=0; i<scoreSort.length; i++){
            indexSort.put(scoreSort[i], i);
        }

        String[] ans = new String[score.length];

        int indexInSort;
        
        for(int i=0; i<score.length; i++){
            indexInSort = indexSort.get(score[i]);

            if(indexInSort == 0){
                ans[i] = "Gold Medal";
            }else if(indexInSort == 1){
                ans[i] = "Silver Medal";
            }else if(indexInSort == 2){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = String.valueOf(indexInSort+1);
            }
        }

        return ans;
    }
}

// t = [10,3,8,9,4] -> sort = [10,9,8,4,3]
// 10 index in sort  = 0 -> Gold Medal
// 3 index in sort = 4 -> 4+1 = 5