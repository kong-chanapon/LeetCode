function numberOfSteps(num: number): number {
    let step:number = 0;
    while(num > 0){
        if(num % 2 == 0){
            num = num / 2;
        }else{
            num--;
        }
        step++;
    }

    return step;
};