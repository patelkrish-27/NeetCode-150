class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    public int binarySearch(int[] nums,int target,int l,int r){
        if(l<=r){
            int mid = l+(r-l)/2;
            int num = nums[mid];
            if(num == target){
                return mid;
            }else if(num > target){
                return binarySearch(nums,target,l,mid-1);
            }else{
                return binarySearch(nums,target,mid+1,r);
            }
        }
        return -1;
    }
}
