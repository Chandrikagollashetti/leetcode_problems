class Solution {
    public int atMostK(int []nums,int  k){
        if(k<0){
            return 0;
        }
        int n=nums.length;
        int t=0;
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(nums[r]==1){
                t++;
            }
            while(t>k){
                if(nums[l]==1){
                    t--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
   public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostK(nums,goal)-atMostK(nums,goal-1);
    }
}