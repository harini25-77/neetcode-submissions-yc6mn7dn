class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int m=Integer.MIN_VALUE;
        while(l<r){
            int a=Math.min(h[l],h[r])*Math.abs(r-l);
            m=Math.max(a,m);
            if(h[l]<h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
    }
}
