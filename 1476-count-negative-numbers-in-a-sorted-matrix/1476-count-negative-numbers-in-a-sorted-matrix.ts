function countNegatives(grid: number[][]): number {
    let counter = 0;
    for(const row of grid){
        for(const col of row){
            if(col < 0) counter++; 
        }
    }

    return counter;
};