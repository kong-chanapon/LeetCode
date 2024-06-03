class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] people = new int[n][2];
        for(int i=0; i<trust.length; i++){
            people[trust[i][0]-1][0]++; // t
            people[trust[i][1]-1][1]++; // p
        }

        for(int i=0; i<people.length; i++){
            if(people[i][0] == 0 && people[i][1] == n-1){
                return i+1;
            }
        }

        return -1;
    }
}

/*
    Input: n = 2, trust = [[1,2]]
    judge must t = 0 and p = n-1 

    n1 -> t=1, p=0
    n2 -> t=0, p=1




 */