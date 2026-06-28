class Solution {
    public boolean check(int[] nums) {
        int count  = 0;
        int n = nums.length;
        for(int i = 1;i<n;i++){
            if(nums[i-1]>nums[i]){
                count = count + 1;
            }
            }
            if(count == 1){
                if(nums[0]>=nums[n-1]){
                    return true;
                }else{
                    return false;
                }
            }else if(count > 1){
                return false;
            }else{
                return true;
            }
        }
    }
