class Solution {
    public int trap(int[] height) {
        int n = height.length - 1;
        int[] lmap = new int[n+1];
        int[] rmap = new int[n+1];
        int lmax = 0;
        int rmax = 0;
        int water=  0;
        for(int i = 0;i<=n;i++){
            int capacity = lmax-height[i];
            if(capacity<0){
                capacity = 0;
            }
            lmap[i] = capacity;
            lmax = Math.max(lmax,height[i]);
            
            capacity = rmax-height[n-i];
             if(capacity<0){
                capacity = 0;
            }
            rmap[n-i] = capacity;
            rmax = Math.max(rmax,height[n-i]);
        }
        for(int i = 0;i<n;i++){
            water += Math.min(lmap[i],rmap[i]);
        }
        return water;
    }
}
