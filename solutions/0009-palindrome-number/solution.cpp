class Solution {
public:
    bool isPalindrome(int x) {
       int X = x;
       long r = 0;
       while(x > 0){
         r +=  x%10;
         r *= 10;
         x /= 10;
        }
       r /= 10;
       if(X == r){
        return true;
       }else{
        return false;
       }
    }
};
