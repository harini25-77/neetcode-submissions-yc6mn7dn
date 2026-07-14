class Solution {
    public int trap(int[] h) {
        int[] lmax=new int[h.length];
        int[] rmax=new int[h.length];
        int w=0;
        lmax[0]=h[0];
        rmax[h.length-1]=h[h.length-1];
        for(int i=1;i<h.length;i++){
            lmax[i]=Math.max(h[i],lmax[i-1]);
        }
        for(int i=h.length-2;i>=0;i--){
            rmax[i]=Math.max(h[i],rmax[i+1]);
        }
        for(int i=0;i<h.length;i++){
            w+=Math.min(lmax[i],rmax[i])-h[i];
        }
        return w;
    }
}
