class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        char[] charK = String.valueOf(k).toCharArray();
        int[] numK = new int[charK.length];
        for(int i=0; i<charK.length; i++)
            numK[i] = Character.getNumericValue(charK[i]);
        
        int[] temp1;
        int[] temp2;
        int n;
        if(num.length > numK.length){
            temp1 = num;
            temp2 = new int[num.length];

            n = temp2.length-1;
            for(int i=numK.length-1; i>=0; i--){
                temp2[n--] = numK[i];
            }

        }else{
            temp1 = numK;
            temp2 = new int[numK.length];

            n = temp2.length-1;
            for(int i=num.length-1; i>=0; i--){
                temp2[n--] = num[i];
            }
        }

        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
        
        int carry = 0;
        int sum;
        for(int i=temp1.length-1; i>=0; i--){
            sum = temp1[i] + temp2[i] + carry;
            temp1[i] = sum%10;
            carry = sum >= 10 ? 1:0;
        }

        List<Integer> ans = new ArrayList<>();
        if(carry != 0){
            ans.add(carry);
        }

        for(int i: temp1){
            ans.add(i);
        }

        return ans;
    }
}