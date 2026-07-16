class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        int num=n;
        while(n!=1 && n!=4){
            int sum=0;
            while(num>0){
                sum+=Math.pow(num%10,2);
                num/=10;
            }
            num=sum;
            n=sum;
        }
        return n==1;
    }
}
