class KthLargest {
    Queue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k);
        this.k = k;
        for(int x:nums){
            add(x);
        }
    }
    
    public int add(int val) {
        if(pq.size() == k){
            if(val > pq.peek()){
             pq.poll();
             pq.add(val);
            }
        }else{
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
