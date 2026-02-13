class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int c=0;
      int n=jewels.length();
      int m=stones.length();
      for(int i=0;i<m;i++){
        if(jewels.indexOf(stones.charAt(i))!=-1){
            c++;
        }
      }  
      return c;
    }
}