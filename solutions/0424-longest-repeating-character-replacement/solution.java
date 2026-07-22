class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int left = 0 ,right = 0;
        int max = 0;
        int[] sets = new int[26];
        while(right<s.length()){
            char c = s.charAt(right);
            sets[c-'A']++;
            max = Math.max(max,sets[c-'A']);
            int valid = (right-left + 1) - max;
            if(!(valid <= k)){
                sets[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left + 1);
            right++;
        }
        return ans;
    }
}
