class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>> hmap = new HashMap<>();
       
        for (int i = 0; i < str.length; i++) {
            String h = getHash(str[i]);
           List<String> res = hmap.get(h);
           if(res == null){
            List<String> s = new ArrayList<>();
            s.add(str[i]);
            hmap.put(h,s);
           }else{
            res.add(str[i]);
            hmap.put(h,res);
           }
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> l:hmap.values()){
            list.add(l);
        }
        return list;
    }

    public static String getHash(String str) {
        int[] charsMap = new int[26];
        for (int i = 0; i < str.length(); i++) {
            charsMap[str.charAt(i) - 'a'] += 1;
        }
       return Arrays.toString(charsMap);
    }
}
