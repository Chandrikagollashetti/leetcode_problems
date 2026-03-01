class Solution {
    public static boolean isPossible(int weights[],int days,int k){
        int t=0;
        for(int i=0;i<weights.length;i++){
            int v=weights[i];
            if(v>k){
                return false;
            }
            if(t+v>k){
                days-=1;
                t=0;
            }
            t+=v;
            if(days==0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isPossible(weights,days,m)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}