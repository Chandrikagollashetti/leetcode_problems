class Solution {
    public int maximumDifference(int[] nums) {
        int m=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int a=nums[i];
                int b=nums[j];
                if(b>a){
                    int t=b-a;
                    m=Math.max(m,t);
                }
            }
        }
        return m;
    }
}