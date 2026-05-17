class Solution {
    public int jump(int[] nums) {
        int totaljumps=0;
        int dest=nums.length-1;
        int cov=0;
        int lastjump=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            cov=Math.max(cov,i+nums[i]);
            if(i==lastjump){
                lastjump=cov;
                totaljumps++;
                if(cov>=dest){
                    return totaljumps;
                }
            }
        }
        return totaljumps;
    }
}