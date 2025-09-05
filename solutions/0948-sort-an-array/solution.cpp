class Solution {
public:
   int partition(vector<int>& nums, int l, int h) {
        int pivot = nums[l];
        int i = l - 1;
        int j = h + 1;

        while (true) {
            do {
                i++;
            } while (nums[i] < pivot);

            do {
                j--;
            } while (nums[j] > pivot);

            if (i >= j)
                return j;

            swap(nums[i], nums[j]);
        }
    }

    void quicksort(vector<int>& nums, int l, int h) {
        if (l < h) {
            int p = partition(nums, l, h);
            quicksort(nums, l, p);
            quicksort(nums, p + 1, h);
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        quicksort(nums,0,nums.size()-1);
    return nums;
    }
};
