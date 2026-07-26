class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int m=t.length();
        char str=0;
        for(int i=0;i<n;i++){
            str^=s.charAt(i);
        }
        
        for(int i=0;i<m;i++){
            str^=t.charAt(i);
        }
        return str;
    }
}