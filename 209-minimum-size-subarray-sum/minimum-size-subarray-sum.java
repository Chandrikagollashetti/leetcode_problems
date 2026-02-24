class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int s=0;
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            s+=nums[r];
            while(s>=target){
                ans=Math.min(ans,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}