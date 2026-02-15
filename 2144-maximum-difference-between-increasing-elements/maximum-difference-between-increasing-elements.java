class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int lm=nums[0];
        for(int i=1;i<nums.length;i++){
            int v=nums[i];
            if(v>lm){
                max=Math.max(max,v-lm);
            }
            lm=Math.min(lm,v);
        }
        return max;
    }
}