class Solution {
    public int minimumCost(int[] cost) {
       int n=cost.length;
       Arrays.sort(cost);
       int t=0;
       for(int i=n-1,cnt=0;i>=0;i--,cnt++){
        if(cnt%3!=2){
            t+=cost[i];
        }
       }
       return t;
    }
}