class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int water = 0;
        while(left<right){
             int capacity = Math.min(height[left],height[right])*(right-left);
             water = Math.max(water,capacity);
             if(height[left]<height[right]){
                left++;
             }else{
                right--;
             }
        }
        return water;
    }
}
