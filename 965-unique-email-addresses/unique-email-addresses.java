class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String email: emails){
            String[] s=email.split("@");
            String l=s[0];
            String d=s[1];
            int p=l.indexOf('+');
            if(p!=-1){
                l=l.substring(0,p);
            }
            l=l.replace(".","");
            set.add(l+"@"+d);
        }
        return set.size();
    }
}