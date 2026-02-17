class Solution {
    public String decodeMessage(String key, String message) {
       HashMap <Character,Character> hm=new HashMap<>();
       int t=97;
       for(int i=0;i<key.length();i++){
        char ch=key.charAt(i);
        if(ch!=' ' && !hm.containsKey(ch)){
            hm.put(ch,(char)t);
            t++;
        }
       }
       String res="";
       for(int i=0;i<message.length();i++){
        char ch=message.charAt(i);
        if(ch!=' '){
            char val=hm.get(ch);
            res+=val;
        }
        else{
            res+=' ';
        }
       }
       return res;
    }
}