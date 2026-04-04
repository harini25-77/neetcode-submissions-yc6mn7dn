class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<0){
                neg[k]=nums[i];
                k++;
            }
            else{
                pos[l]=nums[i];
                l++;
            }
        }
        int m=0;
        int n=0;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            res[i]=pos[m];
            m++;
        }
        for(int i=1;i<nums.length;i+=2){
            res[i]=neg[n];
            n++;
        }
        return res;
    }
}