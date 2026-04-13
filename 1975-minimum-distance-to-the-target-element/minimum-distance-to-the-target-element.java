class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int a=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int d=Math.abs(i-start);
                if(d<a)
                a=d;
            }
        }
        return a;
    }
}