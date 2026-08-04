class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            TreeMap<Integer, String> Imap = new TreeMap();
            Imap.put(timestamp, value);
            map.put(key, Imap);
        } else {
            TreeMap<Integer, String> Imap = map.get(key);
            Imap.put(timestamp, value);
            map.put(key, Imap);
        }
    }

    public String get(String key, int timestamp) {
        String ans = "";
        if (map.containsKey(key)) {
            TreeMap<Integer, String> Imap = map.get(key);
            if (Imap.containsKey(timestamp)) {
                return Imap.get(timestamp);
            } else {
                Map.Entry<Integer,String> e = Imap.floorEntry(timestamp);
                if(e != null){
                    ans = e.getValue();
                }
            }
            return ans;
        } else {
            return "";
        }
    }}

