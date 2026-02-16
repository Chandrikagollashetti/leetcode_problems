class Solution {
    public int maxDistance(int[] colors) {
       int m=0;
       int n=colors.length;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(colors[i]!=colors[j]){
               int diff =j-i;
                m=Math.max(m,diff);
            }
        }
       } 
       return m;
    }
}