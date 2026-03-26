class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts){
            pq.add(i);
        }
        for(int i=0;i<k;i++){
            int mxv=pq.poll();
            int val=(int)Math.sqrt(mxv);
            pq.add(val);
        }
        long res=0;
        for(int i:pq){
            res+=i;
        }
        return res;
    }
}