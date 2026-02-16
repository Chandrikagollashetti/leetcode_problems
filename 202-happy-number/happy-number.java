class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>hm=new HashSet<>();
       while(n!=1){
        if(hm.contains(n)) 
        return false;
        hm.add(n);
       int sum=0;
       while(n>0){
        int d=n%10;
        sum+=d*d;
        n/=10;
       } 
       n=sum;
       }
       return n==1;
    }
}