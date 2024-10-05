public class Solution {
    public IList<string> StringMatching(string[] words) {
        var ans = new HashSet<string>();

        for(int i=0; i<words.Length; i++)
        {
            for(int j=0; j<words.Length; j++)
            {
                if(i != j && words[j].Contains(words[i])){
                    ans.Add(words[i]);
                }
            }
        }

        return ans.ToList();
    }
}