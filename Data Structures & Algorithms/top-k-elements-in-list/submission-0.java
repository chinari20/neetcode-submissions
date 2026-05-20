class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] ans = new int[k];
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->m.get(b)-m.get(a));
        for(int key:m.keySet()){
            pq.add(key);
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    
    }
}
