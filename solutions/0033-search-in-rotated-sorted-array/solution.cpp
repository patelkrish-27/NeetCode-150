class Solution {
public:
     int search(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 1){
            if(nums[0] == target) return 0;
            return -1;
        }
        if(abs(nums[0]-target) > abs(nums[n-1] - target)){
            int i = n-1;
            while(i>=0){
                if(nums[i] == target){
                    return i;
                }
                if(i-1 >=0 && nums[i] <= nums[i-1]){
                    break;
                }
                i--;
            }
            return -1;
        }else{
            int i = 0;
            while(i<n-1){
                if(nums[i] == target){
                    return i;
                }
                    
                if(nums[i] > nums[i+1]){
                    break;
                }
                i++;
            }

            return -1;
        }
    }
};
