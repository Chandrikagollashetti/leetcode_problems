class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      int n=A.length;
      int[] ans=new int[n];
      HashSet<Integer> hs=new HashSet<>();
      int c=0;
      for(int i=0;i<n;i++){
        if(hs.contains(A[i])){
            c++;
        }else{
            hs.add(A[i]);
        }
        if(hs.contains(B[i])){
            c++;
        }else{
            hs.add(B[i]);
        }
        ans[i]=c;
      }  
      return ans;
    }
}