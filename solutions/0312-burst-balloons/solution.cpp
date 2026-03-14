class Solution {
public:
    int maxCoins(vector<int>& nums) {
        nums.insert(nums.begin(), 1);
        nums.push_back(1);
        int n = nums.size();
        
        vector<vector<int>> dp(n, vector<int>(n, 0));
        
        for (int len = 2; len < n; len++)
            for (int l = 0; l < n - len; l++) {
                int r = l + len;
                for (int k = l+1; k < r; k++)
                    dp[l][r] = max(dp[l][r],
                        dp[l][k] + nums[l]*nums[k]*nums[r] + dp[k][r]);
            }
        
        return dp[0][n-1];
    }
};
