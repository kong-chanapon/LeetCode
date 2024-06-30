function checkIfExist(arr: number[]): boolean {
    let set = new Set<number>();
    for(const num of arr){
        if(set.has(num * 2) || set.has(num/2)){
            return true;
        }else{
            set.add(num);
        }
    }


    return false
};