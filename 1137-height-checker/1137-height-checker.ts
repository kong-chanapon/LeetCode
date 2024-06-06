function heightChecker(heights: number[]): number {
    let ans = 0;
    let expected = [...heights].sort((n1, n2)=>{
        if(n1 > n2){
            return 1
        }else if(n1 < n2){
            return -1;
        }else{
            return 0;
        }
    });
    for(let i=0; i<expected.length; i++){
        if(expected[i] != heights[i]){
            ans++;
        }
    }
    return ans;
};
