class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        function<void(int,int)> quicksort = [&](int left, int right) {
            if (left >= right) return;

            int pivot = nums[left + (right - left) / 2];
            int i = left, j = right;

            while (i <= j) {
                while (nums[i] < pivot) i++;
                while (nums[j] > pivot) j--;
                if (i <= j) {
                    swap(nums[i], nums[j]);
                    i++;
                    j--;
                }
            }

            if (left < j) quicksort(left, j);
            if (i < right) quicksort(i, right);
        };

        quicksort(0, nums.size() - 1);
        return nums;
    }
};
