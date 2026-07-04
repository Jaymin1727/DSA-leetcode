class Solution {
    public String reverseWords(String s) {
        String [] word=s.trim().split("\\s+");
        int start=0, end=word.length-1;

        while(start<end){
            String temp=word[start];
            word[start++]=word[end];
            word[end--]=temp;
        }
        return String.join(" ",word);
    }
}