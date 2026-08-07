class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        for(int x:nums){
            pq.add(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
