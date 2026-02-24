class Solution {
    public int atMostK(int nums[],int k){
        int n=nums.length;
        int l=0;
        int ans=0;
        int t=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2==1){
                t++;
            }
            while(t>k){
                if(nums[l]%2==1){
                    t--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int f=atMostK(nums,k)-atMostK(nums,k-1);
        return f;
    }
}