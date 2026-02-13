class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(int i=0;i<sentences.length;i++){
            int w=sentences[i].split(" ").length;
            c=Math.max(c,w);
        }
        return c;
    }
}