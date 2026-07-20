class Solution {
    public boolean isPalindrome(String s) {
    int left  = 0,right = s.length()-1 ;
    while(left < right){
        Character c = Character.toLowerCase(s.charAt(left));
        while(!(Character.isLowerCase(c) ||Character.isDigit(c)) && left < right){
            left++;
             c = Character.toLowerCase(s.charAt(left));
        }
        Character c1 = Character.toLowerCase(s.charAt(right));
        while(!(Character.isLowerCase(c1) ||Character.isDigit(c1)) && left < right){
            right--;
             c1 = Character.toLowerCase(s.charAt(right));
        }
        if(!c.equals(c1)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}

}
