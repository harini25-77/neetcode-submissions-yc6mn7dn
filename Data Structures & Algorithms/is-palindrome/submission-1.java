class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String st="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z') || Character.isDigit(c)){
                st+=c;
            }
        }
        System.out.println(st);
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev+=st.charAt(i);
        }
        if(rev.equals(st)){
            return true;
        }
        return false;
    }
}
