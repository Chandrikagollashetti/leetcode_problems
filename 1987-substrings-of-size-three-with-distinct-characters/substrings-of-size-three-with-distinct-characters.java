class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++){
            char f=s.charAt(i);
            char se=s.charAt(i+1);
            char t=s.charAt(i+2);
            if(f!=se && se!=t && t!=f){
                c++;
            }
        }
        return c;
    }
}