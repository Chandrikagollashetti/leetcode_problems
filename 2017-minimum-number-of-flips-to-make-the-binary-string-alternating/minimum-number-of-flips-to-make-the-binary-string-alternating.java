class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String str=s+s;
        int c1=0;
        int c2=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i%2==0){
                if(c!='0')c1++;
                if(c!='1')c2++;
            }
            else{
                if(c!='1')c1++;
                if(c!='0')c2++;
            }
            if(i>=n){
                char old=str.charAt(i-n);
                if((i-n)%2==0){
                    if(old!='0') c1--;
                    if(old!='1') c2--;
                }
                else{
                    if(old!='1')c1--;
                    if(old!='0')c2--;
                }
            }
            if(i>=n-1){
                ans=Math.min(ans,Math.min(c1,c2));
            }
        }
        return ans;
    }
}