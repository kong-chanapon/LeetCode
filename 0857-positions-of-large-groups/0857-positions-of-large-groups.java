class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int count = 1;
        for(int curr=0; curr<s.length(); curr++){

            if(curr < s.length()-1){

                if(s.charAt(curr) == s.charAt(curr+1)){
                    count++;
                }else{
                    if(count >= 3){
                        ans.add(new ArrayList<>(Arrays.asList(curr-count+1, curr)));
                    }
                    count = 1;
                }

            }else{
               if(count >= 3){
                        ans.add(new ArrayList<>(Arrays.asList(curr-count+1, curr)));
                } 
                 count = 1;
            }
        }


        return ans;
    }
}

/*
    ex s = "abcdddeeeeaabbbcd"
    List<List<Integer>> list;

    count = 1;
    curr = s[0] -> a, next = s[1] -> b
    curr = s[1] -> b, next = s[2] -> c
    curr = s[2] -> c, next = s[3] -> d
    curr = s[3] -> d, next = s[4] -> d  is same count = 2;
    curr = s[4] -> d, next = s[5] -> d  is same count = 3;
    curr = s[5] -> d, next = s[6] -> e  not is same count = 3;
    count > 3 -> new list{5-3+1, 5} add mapPostions 
    reset count = 1

    curr = s[6] -> e, next = s[7] -> e  is same count = 2;
    curr = s[7] -> e, next = s[8] -> e  is same count = 3;
    ...
    curr = s[9] -> e, next = s[10] -> a  is same count = 4;




*/