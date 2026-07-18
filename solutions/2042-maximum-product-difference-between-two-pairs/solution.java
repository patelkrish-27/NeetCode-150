class Solution {
    public int maxProductDifference(int[] nums) {
        int xsm = 10000000,sm =10000000,l = 0,xl = 0;
        for(int x: nums){
             if (x < xsm) {
                sm = xsm;
                xsm = x;
            }else if (x < sm && x >= xsm) {
                sm = x;
            } 
             if (x > xl) {
                l = xl;
                xl = x;
            }else if (x > l&& x <= xl) {
                l = x;
            }
        }
        return (l*xl) - (xsm*sm);
    }
}
