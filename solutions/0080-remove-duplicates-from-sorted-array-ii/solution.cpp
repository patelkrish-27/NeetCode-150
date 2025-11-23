class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() < 2){
            return 1;
        }
       int i = 1;
       int j = 2;
       while(j<nums.size()){
        if(nums[j] != nums[i-1]){
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }else{
           j++;
        }
       }
        return i+1;
    }
};
