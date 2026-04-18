class Solution {
    public int trap(int[] h) {
        int w=0;
        int[] lm=new int[h.length];
        int[] rm=new int[h.length];
        lm[0]=h[0];
        rm[h.length-1]=h[h.length-1];
        for(int i=1;i<h.length;i++){
            lm[i]=Math.max(h[i],lm[i-1]);
        }
        for(int i=h.length-2;i>=0;i--){
            rm[i]=Math.max(h[i],rm[i+1]);
        }
        for(int i=0;i<h.length;i++){
            w+=Math.min(lm[i],rm[i])-h[i];
        }
        return w;
    }
}
