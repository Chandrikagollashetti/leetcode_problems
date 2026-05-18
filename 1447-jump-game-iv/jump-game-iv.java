class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        boolean[] visited=new boolean[n];
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.putIfAbsent(arr[i],new ArrayList<>());
            mp.get(arr[i]).add(i);
        }
        Queue<Integer> que=new LinkedList<>();
        que.offer(0);
        visited[0]=true;
        int steps=0;
        while(!que.isEmpty()){
            int s=que.size();
            while(s-->0){
                int curr=que.poll();
                if(curr==n-1) return steps;
                int l=curr-1;
                int r=curr+1;
                if(l>=0&&!visited[l]){
                    que.offer(l);
                    visited[l]=true;
                }
                if(r<n && !visited[r]){
                    que.offer(r);
                    visited[r]=true;
                }
                if(mp.containsKey(arr[curr])){
                    for(int idx : mp.get(arr[curr])){
                        if(!visited[idx]){
                            que.offer(idx);
                            visited[idx]=true;
                        }
                    }
                }
                mp.remove(arr[curr]);
            }
            steps++;
        }
        return -1;
    }
}