class Solution {
    public static void reverseFn(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
    int n = nums.length;
        k = k % n;
       reverseFn(nums,0,n-k-1);
       reverseFn(nums,n-k,n-1);
       reverseFn(nums,0,n-1);
    }
}
