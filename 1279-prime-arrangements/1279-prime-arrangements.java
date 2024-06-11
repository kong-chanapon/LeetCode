class Solution {
    public int numPrimeArrangements(int n) {
        int prime = 0;

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                prime++;
            }
        }

        int composite = n-prime;


        return (int)((factorial(prime) * factorial(composite)) % (long)(Math.pow(10,9)+7));
    }

    private boolean isPrime(int n){
        int count = 2;
        while(count <= Math.sqrt(n)){
            if(n % count == 0){
                return false;
            }
            count++;
        }

        return true;
    }

    private long factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
            
        return n * factorial(n - 1)%(long)(Math.pow(10,9)+7);
    }
}

/*
    n = 5
   index 1 2 3 4 5 -> prime number have 3 not prime 2
   3! * 2!

    2 3 2 1 1


    index[0] 2 -> 1|2
    index[1] 3 -> 2|3|5
    index[2] 2 -> 3|5
    index[3] 1 -> 5
    index[4] 1 -> 2

 */