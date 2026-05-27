class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Object,Integer>mp=new HashMap<>();
        for(int i=0;i<words.length;i++){
            Integer p=mp.put(pattern.charAt(i),i);
            Integer w=mp.put(words[i],i);
            if(!java.util.Objects.equals(p,w)){
                return false;
            }
        }
        return true;
    }
}