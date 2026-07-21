class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        int one = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }

        s = "1" + s + "1";

        int n = s.length();

        int i = 0;
        int ans = one;

        while (i < n && s.charAt(i) == '1') {
            i++;
        }

        int count10 = 0;
        while (i < n && s.charAt(i) == '0') {
            count10++;
            i++;
        }

        while(i<n){
            int count11 = 0;
        
            while (i < n && s.charAt(i) == '1') {
                count11++;
                i++;
            }

            if (count11 == 0) {
                return ans;
            }

            int count20 = 0;
            while (i < n && s.charAt(i) == '0') {
                count20++;
                i++;
            }

            if (count20 == 0) {
                return ans;
            }
           
            ans = Math.max(ans, one + count10 + count20);

            count10=count20;
        }    
        return ans;
    }
}