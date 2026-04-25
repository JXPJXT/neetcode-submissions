class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.pq=new PriorityQueue<>();
        for(int n:nums){
            pq.add(n);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
