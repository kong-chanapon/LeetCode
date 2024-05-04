class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if(nums.length == 0){
            return ans;
        }

        int start = nums[0];
        int end = nums[0];

        for(int i=0; i<nums.length; i++){
            if(i == nums.length-1){
                end = nums[i];
                if(start == end){
                    ans.add(String.valueOf(start));
                }else{
                    ans.add(String.format("%s->%s", start, end));
                }
                
                break;
            }

            if(nums[i]+1 != nums[i+1]){
                end = nums[i];

                if(start == end){
                    ans.add(String.valueOf(start));
                }else{
                    ans.add(String.format("%s->%s", start, end));
                }

                start = nums[i+1];
                end = nums[i+1];
            }
        }

        return ans;
    }
}