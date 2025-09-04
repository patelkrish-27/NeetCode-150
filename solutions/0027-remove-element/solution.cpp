class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int st=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=val)
                {
                    nums[st]=nums[i];
                    st++;
                }
        }
        return st;
    }
};
