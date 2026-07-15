class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int min=Math.min(word1.length(),word2.length());
        int count=0;
        for(int i=0;i<min;i++){
            str+=word1.charAt(i);
            str+=word2.charAt(i);
            count++;
        }
        if(count==word1.length()){
            for(int j=count;j<word2.length();j++){
                str+=word2.charAt(j);
            }
        }
        else{
            for(int j=count;j<word1.length();j++){
                str+=word1.charAt(j);
            }
        }
        return str;
    }
}