class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=0;
        for(int s:set){
            nums[i]=s;
            i++;
        }
        return i;
    }
}