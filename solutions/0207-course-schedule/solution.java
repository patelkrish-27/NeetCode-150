class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> list = new ArrayList<>();
        int[] visited = new int[numCourses];

        for(int i  = 0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int i =0;i<prerequisites.length;i++)
        {
            int p[] = prerequisites[i];
            list.get(p[0]).add(p[1]);
        }
        for(int i =0;i<numCourses;i++){
           if(!dfs(visited,list,i)) return false;
        }
        return true;
    }

  public boolean dfs(int [] visited,List<List<Integer>> list,int i){
    if(visited[i] == 1) return false;
    if(visited[i] == 2) return true;
    visited[i] = 1;
    List<Integer> requirements = list.get(i);
    int n = requirements.size();
    if(requirements ==  null){
        return true;
    }
    for(int j = 0;j<n;j++){
        if(!dfs(visited,list,requirements.get(j))) return false;
    }
    visited[i] = 2;
    return true;
  }
}
