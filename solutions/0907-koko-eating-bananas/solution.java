class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for (int i = 1; i < n; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }
        if (n >= h) {
            return max;
        } else {
          
            int l =1,r = max;
            while(l<=r){
                int m = l + (r-l)/2;
                if(check(piles,h,m,n)){
                    r = m-1;
                    if(m<max){
                        max = m;
                    }
                }else{
                    l = m+1;
                }
            }
            return max;
        }
    }
    public static boolean check(int[] piles, int h, int k, int n) {
        int hours = 0;
        for (int i = 0; i < n; i++) {
            hours += (piles[i]+k-1)/k;
            if (hours > h) {
                return false;
            }
        }
        return true;
    }

}
