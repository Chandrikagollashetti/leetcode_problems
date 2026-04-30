class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer>t=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target);
        return ans;
    }
     void backtrack(int indx,int[] candidates,int target){
        if(target==0){
            ans.add(new ArrayList<>(t));
            return;
        }
        for(int i=indx;i<candidates.length;i++){
            if(candidates[i]>target)continue;
            t.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i]);
            t.remove(t.size()-1);
        }
    }
}