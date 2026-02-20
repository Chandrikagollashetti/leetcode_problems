class Solution {
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int candy=0;
       int ans=0;
       for(int i=cost.length-1;i>=0;i--){
        if(candy==2){
            candy=0;
        }else{
            ans+=cost[i];
            candy++;
        }
       }
       return ans;
    }
}