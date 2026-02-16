class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int k=nums[i];
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int c=0;
        int s=nums.length/2;
        for(int r:hm.keySet()){
             int val=hm.get(r);
             if(val>s){
                c=r;
                break;
             }
        }
        return c;
    }
}