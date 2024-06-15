class Solution {
public:
    int reverse(long x) {
        long X = x;
        long r = 0;
       
        if(X <0){
            x *= -1;
        }
        while(x > 0){
            r += (x%10);
            r *=10;
            x /= 10;
        }
        r /= 10;
        if(r > INT_MAX || r < INT_MIN){
            return 0;
        }
           if(X <0){
            r *= -1;
        }
        return r;
    }
};
