class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int x2 = x;
        int rev = 0;
        while(x2 != 0){
            rev = rev*10 + x2%10;
            x2 /= 10;
        }
        if(rev == x){
            return true;
        }else{
            return false;
        }
    }
}
