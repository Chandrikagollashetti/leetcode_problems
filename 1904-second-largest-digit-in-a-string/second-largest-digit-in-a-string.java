class Solution {
    public int secondHighest(String s) {
        int l=-1,sh=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                int d=ch-'0';
                if(d>l){
                    sh=l;
                    l=d;
                }else if(d<l && d>sh){
                    sh=d;
                }
            }
        }
        return sh;
    }
}