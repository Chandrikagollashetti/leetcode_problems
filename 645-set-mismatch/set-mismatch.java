class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> hs=new HashSet<>();
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }else{
                d=nums[i];
            }
        }
        int miss=0;
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                miss=i;
            }
        }
        int ans[]={d,miss};
        return ans;
    }
}