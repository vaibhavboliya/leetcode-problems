class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        
        boolean notPrime[] = new boolean[n];
        int upper = (int) Math.sqrt(n);
        int count = 1;
        for(int i=3;i<n;i+=2){
            if(!notPrime[i]){
                count++;
                if(i>upper) continue;
                    for(int j=i*i;j<n;j+=i*2){
                        notPrime[j] = true;
                }
            }
        }
        return count;
        
    }
}