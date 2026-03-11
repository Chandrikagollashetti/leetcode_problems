class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(k==0) return nums.length;
        int val=nums[n-k];
        int c=0;
        for(int num:nums){
            if(num<val){
                c++;
            }
        }
        return c;
    }
}