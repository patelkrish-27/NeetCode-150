class Solution {
public:
    int myAtoi(string s) {
        
        long double n = 0, i;
        bool isNegative = false, started = false;
        // if(s[0] == '-'){
        //     i = 1;
        //     isNegative = true;
        // }
        for (i = 0; i < s.size(); i++) {
            switch (s[i]) {
            case ' ':
              if(n != 0 || started){
                    goto exit;
                }
                break;
            case '0':
                started = true;
                n = (n * 10) + 0;
                break;
            case '-':
                if(n != 0 || started){
                    goto exit;
                }
                isNegative = true;
                started = true;
                break;
            case '+':
                if(n != 0 || started){
                    goto exit;
                }
                started = true;
                break;
            case '1':
                n = (n * 10) + 1;
                break;
            case '2':
                n = (n * 10) + 2;
                break;
            case '3':
                n = (n * 10) + 3;
                break;
            case '4':
                n = (n * 10) + 4;
                break;
            case '5':
                n = (n * 10) + 5;
                break;
            case '6':
                n = (n * 10) + 6;
                break;
            case '7':
                n = (n * 10) + 7;
                break;
            case '8':
                n = (n * 10) + 8;
                break;
            case '9':
                n = (n * 10) + 9;
                break;
            default:
                cout<<"default executed";
                goto exit;
            }
        }

        exit:
        if (isNegative) {
            n *= -1;
            if(n < INT_MIN){
                return INT_MIN;
            }
        }
        if(n > INT_MAX){
            return INT_MAX;
        }
        return n;
    }
};
