class Solution {
    public int reverse(int x) {
        int r=0;
        while(x!=0){
            int d=x%10;
            int nr=r*10+d;
            if((nr-d)/10!=r){
                return 0;
            }
            r=nr;
            x=x/10;
        }
        return r;
    }
}