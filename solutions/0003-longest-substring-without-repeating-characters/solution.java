class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int left = 0,right = 0,ans = 0;
      HashSet<Character> set = new HashSet<>();
      while(right < n ){
        char c = s.charAt(right);
        if(set.contains(c)){
            while(s.charAt(left) != c){
                set.remove(s.charAt(left));
                left++;
            }
                set.remove(s.charAt(left));
                left++;
        }
        set.add(c);
        right++;
        ans = Math.max(ans,right-left);
      }
      return ans;
    }
}
