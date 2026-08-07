class Solution {
    public int lastStoneWeight(int[] stones) {
    Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    for(int x:stones){
        pq.add(x);
    }
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            if(x != y){
                pq.add(y-x);
            }
        }
        return pq.size()>0?pq.poll():0;
    }
}
