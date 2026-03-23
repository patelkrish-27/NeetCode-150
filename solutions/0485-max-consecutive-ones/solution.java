class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int l = 0;
        int r = 0;
        int n = nums.length;
        int maxLen = 0;
        while (r < n) {
            if (nums[r] == 0) {
                l = r + 1;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
