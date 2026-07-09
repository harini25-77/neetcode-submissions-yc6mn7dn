class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        String a="";
        String b="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a' && st.charAt(i)<='z' || Character.isDigit(st.charAt(i)))
            a+=st.charAt(i);
        }
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)>='a' && st.charAt(i)<='z' || Character.isDigit(st.charAt(i)))
            b+=st.charAt(i);
        }
        System.out.println(a);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
