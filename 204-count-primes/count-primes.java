class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean[] prime=new boolean[n];
        Arrays.fill(prime,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]) c++;
        }
        return c;
    }
}