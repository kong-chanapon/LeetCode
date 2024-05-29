class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] myBill = new int[3];

        for(int b: bills){
            if(b == 5){
                myBill[0]++;
            }else if(b == 10){
                if(myBill[0] > 0){
                    myBill[0]--;
                    myBill[1]++;
                }else{
                    return false;
                }
            }else if(b == 20){
                if(myBill[0] > 0 && myBill[1] > 0){
                    myBill[0]--;
                    myBill[1]--;
                }else if(myBill[0] >= 3){
                    myBill[0] -= 3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}

/*
    bills = [5,5,10,10,20]
    pocket{5:0, 10:0, 20:0}
    5 -> pocket{5:1, 10:0, 20:0}
    5 -> pocket{5:2, 10:0, 20:0}
    10 ->  pocket[5] > 0  -> pocket{5:1, 10:1, 20:0}
    10 ->  pocket[5] > 0  -> pocket{5:0, 10:2, 20:0}
    20 ->  (pocket[5] > 1 and  pocket[10] > 1 ) or pocket[5] > 3 
     -> pocket{5:0, 10:2, 15:0}


*/