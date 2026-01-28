class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            if("aeiouAEIOU".indexOf(a[i])==-1){
                i++;
            }
            else if("aeiouAEIOU".indexOf(a[j])==-1){
                j--;
            }else{
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}