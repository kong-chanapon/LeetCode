class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();

        for(int i=1; i<words.length; i++){
            if(i < words.length-1 && words[i-1].equals(first) && words[i].equals(second))
                ans.add(words[i+1]);
        }


        return ans.stream().toArray(String[]::new);
    }
}

/*

    text = "alice is a good girl she is a good student"
    first = "a", second = "good"
    textSplit = ["alice", "is", "a", "good", "girl", "she", "is", "a", "good", "student"]
    

    List ans = []
    temp[i-1] == first && temp[i] == second && i != length-1 -> ans.add(temp[i+1]);




 */