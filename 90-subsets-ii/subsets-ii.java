class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){
            start=0;
            if(i>0 && nums[i]==nums[i-1]){
                start=end+1;
            }
            end=ans.size()-1;
            int size=ans.size();
            for(int j=start;j<size;j++){
                List<Integer>t=new ArrayList<>(ans.get(j));
                t.add(nums[i]);
                ans.add(t);
            }
        }
        return ans;
    }
}