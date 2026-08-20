class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Integer> pq=new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int m:map.keySet()){
            pq.add(m);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] a=new int[pq.size()];
        for(int i=0;i<a.length;i++){
            a[i]=pq.poll();
        }
        return a;
    }
}
