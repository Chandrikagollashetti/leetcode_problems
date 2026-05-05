class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                st.push(ch);
            }else{
                st.pop();
            }   
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
        sb.append(c);
        }
        return sb.toString();
    }
}