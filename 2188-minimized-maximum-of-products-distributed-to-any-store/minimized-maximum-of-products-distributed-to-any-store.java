class Solution {
    public static boolean isPossible(int quantities[],int n,int limit){
        for(int i=0;i<quantities.length;i++){
            int v=quantities[i];
            int t=v/limit;
            if(v%limit!=0){
                t++;
            }
            n-=t;
            if(n<0){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r){
            int m=l+(r-l)/2;
            if(isPossible(quantities,n,m)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}