class Solution {
public:
    bool judgeSquareSum(int c) {
        int sq =sqrt(c)+1;
        long j = 0;
        long i = sq-1;
        while(j<=i){
         long long  sum = i*i + j*j;
                if(sum == c){
                    return true;
                }
                if(sum>c){
                    i--;
                }else{
                    j++;
                }
            
        }
        return false;
    }
};
