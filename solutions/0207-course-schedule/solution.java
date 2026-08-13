class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,Queue<Integer>> map = new HashMap<>();
        HashSet<Integer> set;
        for(int i = 0;i<prerequisites.length;i++){
            int[] p = prerequisites[i];
            Queue<Integer> l = map.getOrDefault(p[0],new PriorityQueue<>());
            l.add(p[1]);
            map.put(p[0],l);
        }

        for(Integer key:map.keySet()){
                set = new HashSet<>();
                set.add(key);
                if(!dfs(map,set,map.get(key))) return false;
        }
        return true;
    }

    public boolean dfs(HashMap<Integer,Queue<Integer>> map, HashSet<Integer> set,Queue<Integer> pr){
        while(!pr.isEmpty()){
            HashSet<Integer> setC = new HashSet<>(set);
            int r = pr.poll();
            if(setC.contains(r)){
                return false;
            }else{
                setC.add(r);
            }
            if(map.containsKey(r)){
                if(!dfs(map,setC,map.get(r))) return false;
            }
        }
        return true;
    }
}
