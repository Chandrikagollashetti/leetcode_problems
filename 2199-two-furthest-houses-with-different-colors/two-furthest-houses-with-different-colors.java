class Solution {
    public int maxDistance(int[] colors) {
       int m=0;
       int n=colors.length;
       for(int i=0;i<n-1;i++){
        if(colors[i]!=colors[n-1]){
            m=Math.max(m,n-i-1);
            break;
        }
    }
    for(int i=n-1;i>=1;i--){
        if(colors[0]!=colors[i]){
            m=Math.max(m,i);
            break;
        }
    }
    return m;
}
}