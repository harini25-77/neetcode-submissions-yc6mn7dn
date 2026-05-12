class Solution {
    public boolean check(int[] nums) {
        int[] n=nums.clone();
        Arrays.sort(n);
        int k=0;
        while(k<n.length){
            int count=0;
            int[] arr=new int[n.length];
            for(int i=0;i<n.length;i++){
                arr[(i+k)%n.length]=n[i];
            }
            for(int i=0;i<n.length;i++){
                if(arr[i]==nums[i]){
                    count++;
                }
            }
            if(count==nums.length){
                return true;
            }
            k++;
        }
        return false;
    }
}