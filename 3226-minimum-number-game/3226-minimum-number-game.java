class Solution {
    public int[] numberGame(int[] nums) {
        List<Integer> listNum = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        List<Integer> ansList = new ArrayList<>();

        for(int n: nums){
            listNum.add(n);
        }

        while(listNum.size() > 0){
            int count = 0;
            while(count < 2){
                int minValue = Collections.min(listNum);
                temp.push(minValue);
                listNum.remove(listNum.indexOf(minValue));
                count++;
            }
            while(!temp.empty()){
                ansList.add(temp.pop());
            }
        }
        int ans[] = new int[ansList.size()];
        for(int i = 0; i<ans.length; i++){
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}