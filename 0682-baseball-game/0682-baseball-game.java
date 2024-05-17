class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        LinkedList<Integer> temp = new LinkedList<>();
        for(String op: operations){
            if(op.equals("C")){
                sum -= temp.removeLast();
            }
            else if(op.equals("D")){
                int d = temp.getLast()*2;
                temp.add(d);
                sum += d;
            }
            else if(op.equals("+")){
                int p = temp.get(temp.size()-1)+temp.get(temp.size()-2);
                temp.add(p);
                sum += p;
            }
            else{
                temp.add(Integer.valueOf(op));
                sum += Integer.valueOf(op);
            }

            // System.out.println(sum);
        }
        return sum;
    }
}

//ops = ["5","-2","4","C","D","9","+","+"]
//temp = [0,0,0,0,0,0,0,0]
//prefixSum = [0,0,0,0,0,0,0,0]

//op 5 -> temp = [5,0,0,0,0,0,0,0], prefixSum = [5,0,0,0,0,0,0,0]
//op -2 -> temp = [5,-2,0,0,0,0,0,0], prefixSum = [5,3,0,0,0,0,0,0]
//op 4 -> temp = [5,-2,4,0,0,0,0,0] prefixSum = [5,3,7,0,0,0,0,0]
//op C -> temp = [5,-2,0,0,0,0,0,0], prefixSum = [5,3,7,3,0,0,0,0]
//op D -> temp = [5,-2,-4,0,0,0,0,0], prefixSum = [5,3,7,3,-1,0,0,0]
//op 9 -> temp = [5,-2,-4,9,0,0,0,0], prefixSum = [5,3,7,3,-1,8,0,0]
//op + -> temp = [5,-2,-4,9,5,0,0,0], prefixSum = [5,3,7,3,-1,8,13,0]
//op + -> temp = [5,-2,-4,9,5,14,0,0], prefixSum = [5,3,7,3,-1,8,14,27]




