class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int x : nums) {
            set.add(x);
        }
        for (int num : set) {
            int count = 1;
            if (!set.contains(num-1)) {
                

                int next = num + 1;
                while (set.contains(next)) {
                    next++;
                    count++;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
