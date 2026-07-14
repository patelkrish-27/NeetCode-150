class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer>  u = new HashMap<>();
        for (char c:s.toCharArray()){
            if(u.get(c) == null){
                u.put(c,1);
            }else{
                 u.put(c,u.get(c)+1);
            }
        }

        for(char c:t.toCharArray()){
            if(u.get(c) == null){
                return false;
            }
            if(u.get(c) == 1){
                u.remove(c);
            }
            if(u.get(c) != null){
                 u.put(c,u.get(c)-1);
            }
        }
        return u.isEmpty();
    }
}
