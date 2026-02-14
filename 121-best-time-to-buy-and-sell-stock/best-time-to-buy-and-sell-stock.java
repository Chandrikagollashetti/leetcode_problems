class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int p=0;
        int l=prices[0];
        for(int i=1;i<n;i++){
            int t=prices[i]-l;
                p=Math.max(p,t);
                if(l>prices[i]){
                    l=prices[i];
                }
        }
        return p;
    }
}