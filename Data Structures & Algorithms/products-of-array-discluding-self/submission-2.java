class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prev=new int[nums.length];
        int[] suff=new int[nums.length];
        prev[0]=1;
        suff[nums.length-1]=1;
        prev[1]=nums[0];
        suff[nums.length-2]=nums[nums.length-1];
        int a=prev[1];
        int b=suff[nums.length-2];
        for(int i=2;i<nums.length;i++){
            prev[i]=nums[i-1]*a;
            a=prev[i];
        }
        for(int i=nums.length-3;i>=0;i--){
            suff[i]=nums[i+1]*b;
            b=suff[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=prev[i]*suff[i];
        }
        return ans;
    }
}  
