class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words=paragraph.split(" ");
        //it converts banned words as set 
        Set<String> b=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> hm=new HashMap<>();
        String ans="";
        int m=0;
        for(String word:words){
            if(!b.contains(word) && word.length()>0){
                hm.put(word,hm.getOrDefault(word,0)+1);
                if(hm.get(word)>m){
                    m=hm.get(word);
                    ans=word;
                }
            }
        }
        return ans;
    }
}