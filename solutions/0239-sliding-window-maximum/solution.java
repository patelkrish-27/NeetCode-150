class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] sl = new int[n-k+1];
        int slp = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            dq.offerLast(i);
            if(i>=k-1){
                sl[slp] = nums[dq.peekFirst()];
                slp++;
            }
        }
        return sl;
    }
}
