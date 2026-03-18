class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("+")){
                int top=st.pop();
                int top1=st.peek();
                int tans=top+top1;
                st.push(top);
                st.push(tans);
            }
            else if(s.equals("D")){
                int top=st.peek();
                st.push(top*2);
            }
            else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.valueOf(s));
            }
        }
        int ans=0;
        for(int i:st){
            ans+=i;
        }
        return ans;
    }
}