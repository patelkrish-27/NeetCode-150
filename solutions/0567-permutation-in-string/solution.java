class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int left = -1;
        int right = 0;
        int count = 0;
        // HashSet<Character> set  = new HashSet<>();
        int[] setC = new int[26];
        for(Character c:s1.toCharArray()){
            // set.add(c);   
            setC[c-'a']++;
        }
        while(right<l2){
            char c = s2.charAt(right);
            if(left != -1 && setC[c-'a'] <= 0 ){
                char c2 = s2.charAt(left);
                // set.add(c2);
                setC[c2-'a']++;
                count--;
                left++;
                continue;
            }
            if(left == -1 && setC[c-'a'] > 0 ){
                left = right;
                count++;
                setC[c-'a']--;
            }else if(setC[c-'a'] > 0){
                count++;
                setC[c-'a']--;
            }
            if(count == l1){
                return true;
            }
            right++;
        }
        return false;
    }
}
