class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int cur=0;
        for(int num:nums){
            cur+=num;
            if(cur>m){
                m=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return m;
    }
}