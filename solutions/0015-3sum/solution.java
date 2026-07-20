class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> sums = new ArrayList<>();
        int n = nums.length;
        for(int i  = 0;i<n;i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int target = nums[i]*(-1);
                int left = i+1,right = n-1;
                while(left<right){
                    int sum = nums[left]+nums[right];
                    if(sum == target){
                        sums.add(new ArrayList<>(Arrays.asList(nums[left++],nums[right--],nums[i])));
                        while(left<right && nums[left] == nums[left-1]){
                            left++;
                        }
                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return sums;
    }
}
