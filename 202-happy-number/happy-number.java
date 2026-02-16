class Solution {
    public boolean isHappy(int n) {
       HashMap<Integer,Boolean>hm=new HashMap<>();
       while(n!=1){
        if(hm.containsKey(n)) 
        return false;
        hm.put(n,true);
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