class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m*n-1;
        return binarySearch(matrix,target,l,r,n);
    }
     public boolean binarySearch(int[][] nums,int target,int l, int r,int n){
        if(l<=r){
            int mid = l + (r-l)/2;
            int num = nums[mid/n][mid%n];
            if(num == target){
                return true;
            }else if(num>target){
                return binarySearch(nums,target,l,mid-1,n);
            }else{
                return binarySearch(nums,target,mid+1,r,n);
            }
        }
        return false;
    }
}
