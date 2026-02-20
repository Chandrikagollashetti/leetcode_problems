class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
           int j=i+k-1;
           int t=nums[j]-nums[i];
           res=Math.min(res,t);
        }
        return res;

    }
}