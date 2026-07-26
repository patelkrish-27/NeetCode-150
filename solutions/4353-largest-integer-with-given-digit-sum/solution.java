class Solution {
    public int largestInteger(int n, int s) {
        if(n*9<s){
            return -1;
        }
        int ans = 0;
        for(int i =0;i<n;i++){
            int digit = Math.min(s,9);
            s -= digit;
            ans *= 10;
            ans += digit;
        }
        return ans;
    }
}
