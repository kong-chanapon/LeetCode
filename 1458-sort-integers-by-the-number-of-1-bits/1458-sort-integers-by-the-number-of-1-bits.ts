function sortByBits(arr: number[]): number[] {

    let map: Map<number, number[]> = new Map();
    let ans: number[] = []

    arr.sort((a,b) => a-b);
    for(let num of arr){
        const bit = bitCount(num);
        if(!map.has(bit)){
            map.set(bit, [num]);
        }else{
            map.get(bit).push(num);
        }
    }

    let keys = [...map.keys()].sort((a,b)=> a-b);

    for(const key of keys){
        ans = ans.concat(map.get(key));
    }


    return ans;
};

function bitCount(num:number){
    let bitOne = 0;
    for(let bit of num.toString(2)){
        if(bit == '1') bitOne++;
    }
    return bitOne;
}