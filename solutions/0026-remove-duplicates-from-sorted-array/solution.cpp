class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()<2){
            return 1;
        }
     int i = 0;
     int j  = 1;
     while(j<nums.size()){
        if(nums[i] == nums[j]){
            j++;
        }else{
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
     }
     return i+1;
    }
};
