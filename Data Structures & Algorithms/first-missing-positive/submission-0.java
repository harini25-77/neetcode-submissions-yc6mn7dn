class Solution {
    public int firstMissingPositive(int[] nums) {
        int a=1;
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(a)){
                a++;
            }
        }
        return a;
    }
}