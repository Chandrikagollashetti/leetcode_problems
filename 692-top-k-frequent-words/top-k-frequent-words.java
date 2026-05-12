class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>mp=new HashMap<>();
        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>(
            (a,b)->{
            if(mp.get(a)!=mp.get(b)){
                return mp.get(b)-mp.get(a);
            }
            return a.compareTo(b);
        }
        );
        pq.addAll(mp.keySet());
        List<String>ans=new ArrayList<>();
        while(k-->0){
            ans.add(pq.poll());
        }
        return ans;
    }
}