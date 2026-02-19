class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> l=new ArrayList<>();
       l.add(1);
       res.add(l);
       for(int i=1;i<numRows;i++){
        List<Integer> t=new ArrayList<>();
        t.add(1);
        for(int j=1;j<i;j++){
            int val=res.get(i-1).get(j)+res.get(i-1).get(j-1);
            t.add(val);
        }
        t.add(1);
        res.add(t);
       } 
       return res;
    }
}