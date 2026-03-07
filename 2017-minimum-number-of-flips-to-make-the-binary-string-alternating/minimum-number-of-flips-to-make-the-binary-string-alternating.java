class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;

        int diff1 = 0;
        int diff2 = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            if(i % 2 == 0){
                if(c != '0') diff1++;
                if(c != '1') diff2++;
            }
            else{
                if(c != '1') diff1++;
                if(c != '0') diff2++;
            }

            if(i >= n){
                char old = str.charAt(i-n);

                if((i-n)%2==0){
                    if(old != '0') diff1--;
                    if(old != '1') diff2--;
                }
                else{
                    if(old != '1') diff1--;
                    if(old != '0') diff2--;
                }
            }

            if(i >= n-1){
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;


    }
}