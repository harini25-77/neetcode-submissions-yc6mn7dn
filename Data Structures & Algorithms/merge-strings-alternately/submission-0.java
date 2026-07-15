class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0;
        while(i!=word1.length() && i!=word2.length()){
            str+=word1.charAt(i);
            str+=word2.charAt(i);
            i++;
        }
        if(i==word1.length()){
            for(int j=i;j<word2.length();j++){
                str+=word2.charAt(j);
            }
        }
        else if(i==word2.length()){
            for(int j=i;j<word1.length();j++){
                str+=word1.charAt(j);
            }
        }
        return str;
    }
}