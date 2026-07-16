class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int rem = target - nums[i];
            Integer res = map.get(rem);
            if(res != null && res != i){
                return new int[]{i,res};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
