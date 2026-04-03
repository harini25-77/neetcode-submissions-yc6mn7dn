class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a=new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            a[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            a[a.length-(i+1)]=nums[nums.length-(i+1)];
        }
        return a;
    }
}