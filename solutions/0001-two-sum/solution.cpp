class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> index = {0, 0};
        for (auto i = nums.begin(); i < nums.end(); i++) {
            for (auto j = i + 1; j < nums.end(); j++) {
                if (*i + *j == target) {
                    index[0] = (i - nums.begin());
                    index[1] = (j - nums.begin());
                    return index;
                }
            }
        }
    return index;
    }
};
