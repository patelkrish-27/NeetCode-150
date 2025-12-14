class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> result;
        int np = -1;
        int size = nums.size();
        for(int i = 0;i<size;i++){
            if(nums[i]<0){
                np++;
            }else{
                break;
            }
        }
        int i = np,j = np+1;
        while(i>= 0 && j < size){
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a<b){
                result.push_back(a);
                i--;
            }else{
                result.push_back(b);
                j++;
            }
        }
        while(j < size){
            int b = nums[j]*nums[j];
            result.push_back(b);
            j++;
        }
        while(i >= 0){
            int a  = nums[i]*nums[i];
            result.push_back(a);
            i--;
        }
        return result;
    }
};
